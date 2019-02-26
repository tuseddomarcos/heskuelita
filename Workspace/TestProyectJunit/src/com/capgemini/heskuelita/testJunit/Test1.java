package com.capgemini.heskuelita.testJunit;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;


class Test1 {

	public Test1() {
		super();
		// TODO Auto-generated constructor stub
	}

	private List<String> list = new ArrayList<String>();
	
	@Test
	void testList() {
		Assertions.assertFalse(list.isEmpty(),"Lista vacia");
		
	}

}
