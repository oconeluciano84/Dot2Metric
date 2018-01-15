package testDot2Metric;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dot2metric.Preprocessing;
import junit.framework.TestCase;

public class TestPreprocessing extends TestCase {
	private static Preprocessing preproc;
	private static String path_input;
	private static String path_output;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		preproc = new Preprocessing(path_input, path_output);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		path_input="input";
		path_output="output";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPreprocessing() {
		System.out.println("Running -- testPreprocessing()");
		preproc = new Preprocessing(path_input, path_output);
		assertNotNull(preproc);
	}

	@Test
	public void testStart() {
		fail("Not yet implemented");
	}

	@Test
	public void testFormattingLine() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteDirectory() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFile_analizzati() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFile_analizzati() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsError() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetError() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPath_input() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPath_input() {
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
	public void testGetExecution_time() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetExecution_time() {
		fail("Not yet implemented");
	}

}
