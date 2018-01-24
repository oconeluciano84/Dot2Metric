package testGrammatica;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import grammatica.DotGrammar;
import grammatica.ParseException;
import utility.ObjMetodo;

public class TestDotGrammar {
	private static DotGrammar grm;
	private static FileInputStream fis;
//	private static String encoding;
	private static ObjMetodo objM;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
//		File file = new File("input/pre.dot");
		File file = new File("input/classcom_1_1jaeksoft_1_1pojodbc_1_1_query_ab296f2c345981790bbf8b7fe8c337d9c_cgraph.dot");
		fis = new FileInputStream(file);
//		grm = new DotGrammar(fis);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		grm = new DotGrammar(fis);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	

	@SuppressWarnings("unlikely-arg-type")
	@Test//(expected = RuntimeException.class)
	public void testStart() {
		System.out.println("Running -- TestDotGrammar.testStart()");
		try {
			System.out.println("dentro try cacth");
			objM = grm.start();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//assertFalse(e.equals(""));
		}
		
		assertNotNull(objM);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testInit() {
		System.out.println("Running -- testInit()");
		try {
			grm.init();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertFalse(e.equals(""));
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testGetNomeMetodo() {
		System.out.println("Running -- testGetNomeMetodo()");
		try {
			String str = grm.getNomeMetodo();
			System.out.println("risultato --> "+str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertFalse(e.equals(""));
		}
	}
/*
	@Test
	public void testSkip_intestazione() {
		fail("Not yet implemented");
	}

	@Test
	public void testGestioneNodi() {
		fail("Not yet implemented");
	}

	@Test
	public void testDichiarazioneNodo() {
		fail("Not yet implemented");
	}

	@Test
	public void testDichiarazioneArco() {
		fail("Not yet implemented");
	}

	@Test
	public void testDotGrammarInputStream() {
		fail("Not yet implemented");
	}

	@Test
	public void testDotGrammarInputStreamString() {
		fail("Not yet implemented");
	}

	@Test
	public void testReInitInputStream() {
		fail("Not yet implemented");
	}

	@Test
	public void testReInitInputStreamString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDotGrammarReader() {
		fail("Not yet implemented");
	}

	@Test
	public void testReInitReader() {
		fail("Not yet implemented");
	}

	@Test
	public void testDotGrammarDotGrammarTokenManager() {
		fail("Not yet implemented");
	}

	@Test
	public void testReInitDotGrammarTokenManager() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNextToken() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetToken() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateParseException() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnable_tracing() {
		fail("Not yet implemented");
	}

	@Test
	public void testDisable_tracing() {
		fail("Not yet implemented");
	}
	*/
}
