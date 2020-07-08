/////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: Numeric Sequence Generator
// Files: Sequence.java, GeometricSequenceGenerator.java, FibonacciSequenceGenerator.java, 
// DigitProductSequenceGenerator.java, and SequenceGeneratorTests.java
// Course:CS 300, Fall 2018
//
// Author:     Ruoxi Shen
// Email:      rshen27@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: N/A
// Partner Email: N/A
// Partner Lecturer's Name: N/A
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// ___ Write-up states that pair programming is allowed for this assignment.
// ___ We have both read and understand the course Pair Programming Policy.
// ___ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: N/A
// Online Sources: N/A
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

import java.util.ArrayList;

/**
 * This class is testing the functions of the Sequence class
 * with other sequence generators. The class is including three
 * test methods and a main method. Each test focuses on one of the 
 * sequence generators and checks the results.
 * 
 * @author Shen
 */

public class SequenceGeneratorTests {

/**
 * This test returns false if either the constructor or hasNext() or next() method 
 * implemented in the GeometricSequenceGenerator class does not return the expected 
 * output.
 */
public static boolean geometricSequenceGeneratorTest() {
	  boolean passed = false;  // Set a test variable 
	  
	  try {
	    GeometricSequenceGenerator test = new GeometricSequenceGenerator(-1, 6, 12);
	  } catch(IllegalArgumentException e) {
	    if(e.getMessage().equals("WARNING: CANNOT create a sequence with size <= zero."))
	      passed = true;
	  }
	  GeometricSequenceGenerator test = new GeometricSequenceGenerator(2, 4, 8);
	  if (!(test.hasNext() && test.next() == 1))
	    passed = false;
	  return passed;
	}


/**
 * This test returns false if either the constructor or hasNext() or next() method 
 * implemented in the fibonacciSequenceGeneratorTest class does not return the expected 
 * output.
 */
public static boolean fibonacciSequenceGeneratorTest() {
  boolean passed = false;   // Set a test variable
  try {
    FibonacciSequenceGenerator test = new FibonacciSequenceGenerator(-4);
  } catch(IllegalArgumentException e) {
    if(e.getMessage().equals("WARNING: CANNOT create a sequence with size <= zero."))
      passed = true;
  }
  FibonacciSequenceGenerator test = new FibonacciSequenceGenerator(4);
  if (!(test.hasNext() && test.next() == 0))
    passed = false;
  return passed;
}

/**
 * This test returns false if either the constructor  
 * implemented in the digitProductSequenceGeneratorTest class does not return the expected 
 * output.
 */
public static boolean digitProductSequenceGeneratorTest() {
  boolean passed = false;  // Set a test variable
  try {
    DigitProductSequenceGenerator test = new DigitProductSequenceGenerator(2,-2);
  } catch(IllegalArgumentException e) {
    if(e.getMessage().equals("WARNING: CANNOT create a sequence with size <= zero."))
      passed = true;
  }
  DigitProductSequenceGenerator test = new DigitProductSequenceGenerator(104, 208);
  if (test.getSequence().get(1) != 108)
    passed = false;
  return passed;
}

/**
 * Main testing
 * 
 * @param args
 */
public static void main(String[] args) {
  int fails = 0;
  if (!geometricSequenceGeneratorTest()) {
    System.out.println("geometricSequenceGeneratorTest failed");
    fails++;
  }
  if (!fibonacciSequenceGeneratorTest()) {
    System.out.println("fibonacciSequenceGeneratorTest failed");
    fails++;
  }
  if (!digitProductSequenceGeneratorTest()) {
    System.out.println("digitProductSequenceGeneratorTest failed");
    fails++;
  }
  if (fails == 0)
    System.out.println("All tests passed!");
}
}

