package testDot2Metric;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dot2metric.Preprocessing;
import dot2metric.Traduzione;
import grammatica.ParseException;

public class TestTraduzione {
	private static String path_input="input";
	private static String path_output="output";
	private static Preprocessing preproc;
	private static Traduzione trad;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		preproc = new Preprocessing(path_input, path_output);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		preproc.start();
		trad = new Traduzione(path_output);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTraduzione() {
		System.out.println("Running -- testTraduzione()");
		assertNotNull(trad);
	}

	@Test
	public void testStart() {
	System.out.println("Running -- testStart()");
	try {
		assertFalse(trad.start());
	} catch (ParseException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	/*
	@Test
	public void testIsError() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetError() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetExecution_time() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetExecution_time() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotale_metodi() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTotale_metodi() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDirectory_input_modificati() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDirectory_input_modificati() {
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
	public void testGetFile_chiamate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFile_chiamate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFile_coppie() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFile_coppie() {
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
		*/
}
