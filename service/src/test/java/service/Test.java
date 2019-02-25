package service;
import org.junit.*;
import java.util.ArrayList;

public class Test {
	
	private ArrayList<Integer> list;
	
	public Test() {
		this.list = new ArrayList<Integer> ();
		list.add(12);
		list.add(5);
		list.add(18);
	}

	@org.junit.Test
	public void test() {
		Assert.assertTrue("List is empty", list.isEmpty());
	}

}
