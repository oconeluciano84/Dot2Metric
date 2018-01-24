package testDot2Metric;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

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
	private Scanner read;
	

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
		preproc = new Preprocessing(path_input, path_output);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPreprocessing() {
		System.out.println("Running -- testPreprocessing()");
		//preproc = new Preprocessing(path_input, path_output);
		assertNotNull(preproc);
	}

	@Test
	public void testStart() {
		System.out.println("Running -- testStart()");
		try {
			// False perche se non trova la directory torna sempre false
//			assertFalse(preproc.start());
			preproc.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f = new File(path_output+"/input_mod");
		assertTrue(f.isDirectory());
	}
	
	@Test(expected = Exception.class)
	public void testFormattingLine() {
		System.out.println("Running -- testFormattingLine()");
		File input = new File(path_input+"/pre.dot");
		File output = new File(path_output+"/input_mod/"+input.getName());

		
		try {
			preproc.formattingLine(input, output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			read = new Scanner(output);
			while(read.hasNextLine()) {
				String line = read.nextLine();
				assertTrue(!line.contains(" "));
				assertTrue(!line.contains("\\\\l"));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/*
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
			*/
}
