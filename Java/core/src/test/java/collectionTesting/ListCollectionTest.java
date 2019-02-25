package collectionTesting;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ListCollectionTest {
	
	@Test
	protected void shouldAddAtIndex() {
		// Arrange
		List<String> testerList = new ArrayList<String>();
		
		// Act
		testerList.add("Jose");
		testerList.add("Mario");
		testerList.add(1, "Elvira");
		
		// Assert
		assertTrue("Didn't add anything", testerList.contains("Jose"));
		assertTrue("Didn't add at index", testerList.get(1).equals("Elvira"));
	}
	
	@Test
	protected void shouldRemoveElement() {
		List<String> testerList = new ArrayList<String>();
		
		testerList.add("Jose");
		testerList.add("Mario");
		testerList.remove("Jose");
		
		assertFalse("Didn't remove anything", testerList.contains("Jose"));
	}
	
	@Test
	protected void shouldRemoveAtIndex() {
		List<String> testerList = new ArrayList<String>();
		
		testerList.add("Jose");
		testerList.add("Mario");
		testerList.add(1, "Elvira");
		testerList.remove(2);
		
		assertFalse("Didn't remove at index", testerList.contains("Mario"));
	}
	
	@Test
	protected void shouldClearList() {
		List<String> testerList = new ArrayList<String>();
		
		testerList.add("Jose");
		testerList.add("Mario");
		testerList.add(1, "Elvira");
		testerList.clear();
		
		assertTrue("Didn't clear the list", testerList.isEmpty());
	}
	
	@Test
	protected void shouldContainList() {
		List<String> testerList = new ArrayList<String>();
		List<String> containedList = new ArrayList<String>();
		
		containedList.add("Jose");
		containedList.add("Mario");
		testerList.addAll(containedList);
		testerList.add(1, "Elvira");
		
		assertTrue("Didn't contain the list", testerList.containsAll(containedList));
	}
	
	@Test
	protected void shouldReturnElementAtIndex() {
		List<String> testerList = new ArrayList<String>();
		
		testerList.add("Jose");
		testerList.add("Mario");
		testerList.add(1, "Elvira");
		
		assertTrue("Didn't return element at index", testerList.get(2).equals("Mario"));
	}
	
	@Test
	protected void shouldReturnIndexOfOcurrence() {
		List<String> testerList = new ArrayList<String>();
		
		testerList.add("Jose");
		testerList.add("Mario");
		testerList.add(1, "Elvira");
		testerList.add("Jose");
		testerList.add("Mario");
		
		assertTrue("Didn't return first index of ocurrance", testerList.indexOf("Jose") == 0);
		assertTrue("Didn't return last index of ocurrance", testerList.lastIndexOf("Jose") == 3);
	}
	
	@Test
	protected void shouldReplaceElementAtIndex() {
		List<String> testerList = new ArrayList<String>();
		
		testerList.add("Jose");
		testerList.add("Mario");
		testerList.add(1, "Elvira");
		testerList.set(0, "Gabriel");
		
		assertTrue("Didn't replace element at correct index", testerList.get(0).equals("Gabriel"));
	}
	
	@Test
	protected void shouldReturnListSize() {
		List<String> testerList = new ArrayList<String>();
		
		testerList.add("Jose");
		testerList.add("Mario");
		testerList.add(1, "Elvira");
		
		assertSame("Shows incorrect size", 3, testerList.size());
	}

}
