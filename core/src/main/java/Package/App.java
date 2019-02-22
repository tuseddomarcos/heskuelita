package Package;
import java.util.*;

public class App {
	
	public static void main (String[] args) {
		
		Map<Integer, String> setL = new HashMap<Integer, String> ();
		setL.put(1, "Raul");
		setL.put(2, "Jose");
		setL.put(3, "Fran");
		
		System.out.println(setL.size());
		
		Set<Integer> set = setL.keySet();
	}
}
