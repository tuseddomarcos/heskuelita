package collectionTesting;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class MapTest {
	
	@Test
	protected void shouldAssociateKeyWithValue() {
		// Arrange
		Map<Integer, String> testerMap = new HashMap<Integer, String>();
		
		// Act
		testerMap.put(0, "Jose");
		
		// Assert
		assertTrue("Didn't associate the key with the value", testerMap.get(0).equals("Jose"));
	}
	
	@Test
	protected void shouldRemoveValueAssociatedWithKey() {
		Map<Integer, String> testerMap = new HashMap<Integer, String>();
		
		testerMap.put(0, "Jose");
		testerMap.put(1, "Mario");
		testerMap.remove(0);
		
		assertFalse("Didn't remove value associated with key", testerMap.containsKey(0));
	}
	
	@Test
	protected void shouldContainKeyOrValue() {
		Map<Integer, String> testerMap = new HashMap<Integer, String>();
		
		testerMap.put(0, "Jose");
		testerMap.put(1, "Mario");
		
		assertTrue("Didn't contain key", testerMap.containsKey(0));
		assertTrue("Didn't contain value", testerMap.containsValue("Mario"));
	}
	
	@Test
	protected void shouldReturnValueAssociatedWithKey() {
		Map<Integer, String> testerMap = new HashMap<Integer, String>();
		
		testerMap.put(0, "Jose");
		testerMap.put(1, "Mario");
		
		assertTrue("Didn't return correct value", testerMap.get(0).equals("Jose"));
	}
	
	@Test
	protected void shouldClearMap() {
		Map<Integer, String> testerMap = new HashMap<Integer, String>();
		
		testerMap.put(0, "Jose");
		testerMap.put(1, "Mario");
		testerMap.clear();
		
		assertTrue("Didn't clear the Map", testerMap.isEmpty());
	}
	
	@Test
	protected void shouldReturnMapSize() {
		Map<Integer, String> testerMap = new HashMap<Integer, String>();
		
		testerMap.put(0, "Jose");
		testerMap.put(1, "Mario");
		
		assertSame("Didn't return the correct size", 2, testerMap.size());
	}

}
