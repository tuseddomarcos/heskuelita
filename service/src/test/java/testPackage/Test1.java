package testPackage;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;


public class Test1 {
	private ArrayList<String> lista;
    public Test1() {
    	this.lista=new ArrayList<String>();
    	lista.add("juan");
    	lista.add("pedro");
    }
	@Test
	public void testContenido() {
		Assert.assertFalse("vacio", lista.contains("pedro"));
	}

}
