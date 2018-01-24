package testDot2Metric;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import dot2metric.Analisi;
import junit.framework.TestCase;
import utility.ObjMetodo;


public class TestDot2Metric extends TestCase {
	@Test
	public void testMain() {
		System.out.println("Test method --> main() ");
		
		try {
			String[] args= new String[2];
			args[0]="11";
			args[1]="113";
			dot2metric.dot2metric.loadConfig(args);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File config = new File("config_path.dat");
		assertTrue(config.exists());
	}
	@Test
	public void testLoadText() {
		System.out.println("Test method --> loadTest()");

	}
	@Test
	public void testLoadConfig() {
		System.out.println("Test method --> loadConfig()");
	}
	@Test
	public void testSetConfig() {
		System.out.println("Test method --> setConfig()");
		
	}
	@Test
	public void testSetConfig2() {
		System.out.println("Test method --> setConfig2()");
		
	}
	@Test
	public void testSetConfig3() {
		System.out.println("Test method --> setConfig3()");
		
	}
	@Test
	public void testSetConfig4() {
		System.out.println("Test method --> setConfig4()");
		
	}
	@Test(expected = Exception.class)
	public  void testAnalisi_start() throws FileNotFoundException {
		System.out.println("Test method --> Analisi.start()");
		HashMap<String, ArrayList<ObjMetodo>> ar= new HashMap<String, ArrayList<ObjMetodo>>();
		Analisi a = new Analisi("", ar);
		assertNotNull(a);
		
	}
	

}
