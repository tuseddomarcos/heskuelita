package com.capgemini.heskuelita.test;
import static org.junit.Assert.*;
import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CollectionTest{
	
	List <String> list;
	List <String> list2;
	
	@Before
	public void test(){
		list =new ArrayList<String>();
		list2 =new ArrayList<String>();
	}
	
	@Test
	public void addTest(){
		assertTrue(list.add("gato"));
	}
	
	@Test
	public void addAllTest(){
		list2.add("perro");
		assertTrue(this.list.addAll(list2));
	}

	@Test
	public void containsTest(){
	
		assertFalse(list.contains("gato"));
		
	}
	
	@Test
	public void containsAllTest(){
		assertTrue(list.containsAll(list2));
	}
	
	@Test
	public void equalsTest(){
		assertTrue(list.equals(list2));
	}
	
	@Test
	public void isEmptyTest(){
		assertTrue(list.isEmpty());
	}
	
	@Test
	public void removeTest(){
		assertFalse(list.remove("gato"));
	}
	
	@Test
	public void removeAllTest(){
		assertFalse(list.removeAll(list2));
	}
	
	@Test
	public void retainAllTest(){
		assertFalse(list.retainAll(list2));
	}
	
	
}