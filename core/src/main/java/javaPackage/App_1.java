package javaPackage;
import java.util.HashSet;

public class App_1 {
   public static void main(String[] args) {
	HashSet<String> list = new HashSet<String>();
	HashSet<String> list1 = new HashSet<String>();
	list.add("hola");
	list.add("mundo");
	for (String i: list) {
		System.out.println(i);
	}
	list1.addAll(list);
	list.isEmpty();
	list.clear();
	for (String i: list1) {
		System.out.println(i);
	}
   }
}
