package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.epsilon.cbp.util.StringOutputStream;
import org.junit.Test;

import UML.Generalization;
import UML.Model;
import UML.UMLFactory;
import UML.UMLPackage;

public class MetamodelTest {

	@Test
	public void testLoadModel() {
		try {
			UMLPackage.eINSTANCE.eClass();
			
			File xmiFile = new File ("D:\\TEMP\\ASE\\bpmn.reduced.xmi");
			
			XMIResourceImpl xmiResource = (XMIResourceImpl) (new XMIResourceFactoryImpl())
					.createResource(URI.createFileURI(xmiFile.getAbsolutePath()));
			xmiResource.load(null);
			
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals(true, false);
		}
		assertEquals(true, true);
	}
	
	@Test
	public void testSaveModel() {
		try {
			UMLPackage.eINSTANCE.eClass();
			
			File xmiFile = new File ("D:\\TEMP\\ASE\\bpmn2_xmi\\BPMN2-0000001-1b47f8942c6849ba1c2c61eb3e2253217361dbbc.xmi");
			
//			XMIResourceImpl xmiResource = (XMIResourceImpl) (new XMIResourceFactoryImpl())
//					.createResource(URI.createFileURI(xmiFile.getAbsolutePath()));
//			xmiResource.load(null);
			
			XMIResourceImpl xmiResource = (XMIResourceImpl) (new XMIResourceFactoryImpl())
					.createResource(URI.createURI("dummy.xmi"));
			
			Model model1 = UMLFactory.eINSTANCE.createModel();
			model1.setName("AAAA");
			Model model2 = UMLFactory.eINSTANCE.createModel();
			model2.setName("BBB");
			Model model3 = UMLFactory.eINSTANCE.createModel();
			model3.setName("CCC");
			
			model1.getPackagedElement().add(model2);
			
			xmiResource.getContents().add(model1);
//			xmiResource.getContents().add(model2);
			xmiResource.getContents().add(model3);
			
			StringOutputStream output = new StringOutputStream();
			xmiResource.save(output, null);
			
			System.out.print(output.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals(true, false);
		}
		assertEquals(true, true);
	}
	
	
	@Test
	public void testSaveAndLoadModel() {
		try {
			UMLPackage.eINSTANCE.eClass();
			
			XMIResourceImpl xmiResource = (XMIResourceImpl) (new XMIResourceFactoryImpl())
					.createResource(URI.createURI("dummy.xmi"));
			
			Model m1 = UMLFactory.eINSTANCE.createModel();
			m1.setName("M1");
			
			Model m2 = UMLFactory.eINSTANCE.createModel();
			m2.setName("M2");
			
			UML.Class c2 = UMLFactory.eINSTANCE.createClass();
			c2.setName("A");
			
			Generalization g1 = UMLFactory.eINSTANCE.createGeneralization();
			g1.setGeneral(c2);
			UML.Class c1 = UMLFactory.eINSTANCE.createClass();
			c1.getGeneralization().add(g1);
			c1.setName("B");
			
			UML.Package p1 = UMLFactory.eINSTANCE.createPackage();
			p1.setName("P1");
			p1.getPackagedElement().add(c2);
			
			m1.getPackagedElement().add(c1);
			m2.getPackagedElement().add(p1);
			xmiResource.getContents().add(m1);
			xmiResource.getContents().add(m2);
			
			StringOutputStream output = new StringOutputStream();
			xmiResource.save(output, null);
			
			System.out.print(output.toString());

			xmiResource.unload();
			xmiResource.load(new ByteArrayInputStream(output.toString().getBytes()), null);
			
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals(true, false);
		}
		assertEquals(true, true);
	}
}
