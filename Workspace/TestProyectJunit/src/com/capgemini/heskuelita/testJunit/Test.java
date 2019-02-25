package com.capgemini.heskuelita.testJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;

import junit.framework.Assert;

class Test {

	private List<String> list = new ArrayList<String>();
	
	@org.junit.jupiter.api.Test
	void testList() {
		Assertions.assertEquals(false, list.isEmpty());
		
	}

}
