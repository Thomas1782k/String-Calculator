package com.stringCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	    //Step 1:
	    @Test
	    public void testAdd_EmptyString_ReturnsZero() throws Exception {
	    	App calculator = new App();
	        assertEquals(0, calculator.add(""));
	    }
	    
	    //Step: 2
	    @Test
	    public void testAdd_SingleNumber_ReturnsNumber()  {
	    	App calculator = new App();
	        assertEquals(5, calculator.add("5"));
	    }

	    @Test
	    public void testAdd_TwoNumbersSeparatedByComma_ReturnsSum() {
	    	App calculator = new App();
	        assertEquals(10, calculator.add("5,5"));
	    }

	    @Test
	    public void testAdd_MultipleNumbersSeparatedByComma_ReturnsSum() {
	    	App calculator = new App();
	        assertEquals(15, calculator.add("5,5,5"));
	    }

	    //Step: 3
	    @Test
	    public void testAdd_NewLinesBetweenNumbers_ReturnsSum()  {
	    	App calculator = new App();
	        assertEquals(6, calculator.add("1\n2,3"));
	    }
	    
	    //Step: 5
	    @Test(expected =IllegalArgumentException.class)
	    public void test_Negative_nums() {
	    	App calculator=new App();
	    	calculator.add("-1,-2,3");
	    }

	    //Step: 4
	    @Test
	    public void test_CustomDelimeters(){
	    	App calculator=new App();
	    	assertEquals(3, calculator.add("//;\n1;2"));
	    }
	

}
