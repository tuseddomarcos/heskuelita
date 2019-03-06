package com.capgemini.heskuelita.beens;

import static org.junit.Assert.*;

import org.junit.Test;
import com.capgemini.heskuelita.jdbc.*;
import com.capgemini.heskuelita.jdbc.test.JDBCTest;


public class ClasBDTest {

public static void main (String [] arg) throws Exception {
	
	
	JDBCTest bd = new JDBCTest();
	bd.setup();
	bd.destroy();
	
	
}
	
}

