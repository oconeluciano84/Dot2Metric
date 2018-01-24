package testDot2Metric;

import static org.junit.Assert.*;

import java.io.File;
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
import dot2metric.Reporting;
import dot2metric.Traduzione;
import utility.ObjMetodo;

public class TestReporting {
	private static String path_input="input";
	private static String path_output="output";
	private static Preprocessing preproc;
	private static Traduzione trad;
	private static	Analisi a;
	private static HashMap<String, ArrayList<ObjMetodo>> mappa;
	private static Reporting rep;
	private File f;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		preproc = new Preprocessing(path_input, path_output);
		trad = new Traduzione(path_output);
		mappa= new HashMap<String, ArrayList<ObjMetodo>>();
		a= new Analisi(path_output,mappa);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		preproc.start();
		trad.start();
		a.start();
		rep = new Reporting(path_output, preproc, trad, a);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReporting() {
		System.out.println("Running -- testReporting()");
		assertNotNull(rep);
	}

	@Test
	public void testStart() {
		System.out.println("Running -- testStart()");
		try {
			rep.start();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f = new File(rep.getPath_output()+"/report.metric");
		assertTrue(f.exists());
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
	public void testGetPreprocessing() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPreprocessing() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTraduzione() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTraduzione() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAnalisi() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAnalisi() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFile_report() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFile_report() {
		fail("Not yet implemented");
	}
	*/
}
