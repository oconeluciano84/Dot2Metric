package testDot2Metric;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dot2metric.Analisi;
import dot2metric.Preprocessing;
import dot2metric.Traduzione;
import utility.ObjMetodo;

public class TestAnalisi {
	private static String path_input="input";
	private static String path_output="output";
	private static Preprocessing preproc;
	private static Traduzione trad;
	private static	Analisi a; 
	private static HashMap<String, ArrayList<ObjMetodo>> mappa;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		preproc = new Preprocessing(path_input, path_output);
		trad = new Traduzione(path_output);
		mappa= new HashMap<String, ArrayList<ObjMetodo>>();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		preproc.start();
		trad.start();
		a= new Analisi(path_output,mappa);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAnalisi() {
		System.out.println("Running -- testAnalisi()");
		assertNotNull(a);
	}      
	
	@Test
	public void testStart() {
		System.out.println("Running -- testStart()");
		try {
			System.out.println("prima");
			a=new Analisi(path_output, mappa);
			System.out.println(a.getPath_output()+" -- "+a.getFile_output());
			a.start();
			System.out.println("dopo");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/*
	@Test
	public void testGetExecution_time() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetExecution_time() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPath_output() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPath_output() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMappa() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMappa() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotale_chiamate_dirette() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTotale_chiamate_dirette() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotale_chiamate_indirette() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTotale_chiamate_indirette() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotale_metodi_polimorfici() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTotale_metodi_polimorfici() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotale_metodi_indipendenti() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTotale_metodi_indipendenti() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotale_metodi_dipendenti() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTotale_metodi_dipendenti() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFile_output() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFile_output() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFile_trees() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFile_trees() {
		fail("Not yet implemented");
	}
		*/
}
