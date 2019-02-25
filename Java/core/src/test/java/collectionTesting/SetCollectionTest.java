package collectionTesting;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class SetCollectionTest {
	
	@Test
	protected void shouldAddJose() {
		// Arrange
		Set<String> testerSet = new HashSet<String>();
		
		// Act
		testerSet.add("Jose");
		
		// Assert
		assertTrue("Didn't add anything", testerSet.contains("Jose"));
	}
	
	@Test
	protected void shouldRemoveJose() {
		Set<String> testerSet = new HashSet<String>();
		
		testerSet.add("Jose");
		testerSet.remove("Jose");
		
		assertFalse("Didn't remove anything", testerSet.contains("Jose"));
	}
	
	@Test
	protected void shouldClearSet() {
		Set<String> testerSet = new HashSet<String>();
		
		testerSet.add("Jose");
		testerSet.clear();
		
		assertTrue("Can't clear the Set", testerSet.isEmpty());
	}
	
	@Test
	protected void shouldReturnSetSize() {
		Set<String> testerSet = new HashSet<String>();
		
		testerSet.add("Jose");
		testerSet.add("Mario");
		testerSet.add("Elvira");
		
		assertSame("Shows incorrect size", 3, testerSet.size());
	}
	
	@Test
	protected void shouldContainSet() {
		Set<String> testerSet = new HashSet<String>();
		Set<String> containedSet = new HashSet<String>();
		
		testerSet.add("Elvira");
		containedSet.add("Jose");
		containedSet.add("Mario");
		testerSet.addAll(containedSet);
		testerSet.add("Gabriel");
		
		assertTrue("Doesn't contain the Set", testerSet.containsAll(containedSet));
	}

}
