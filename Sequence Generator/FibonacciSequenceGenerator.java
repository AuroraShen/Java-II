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

import java.util.Iterator;
 
/**
 * This class represents a generator for an Fibonacci Sequence
 * This class implements the Iterator<Integer> interface
 * 
 * @author Shen
 */
public class FibonacciSequenceGenerator implements Iterator<Integer> {
  private final int SIZE; // number of elements in this sequence
  private int prev; // previous item in the sequence with respect to the current iteration
  private int next; // next item in the sequence with respect to the current iteration
  private int generatedCount; // number of items generated so far
  
 
  /**
   * Generates an Fibonacci Sequence
   * @param size number of elements in the sequence
   */
  public FibonacciSequenceGenerator(int size) {
	// check for the precondition: size > 0, throws an IllegalArgumentException if this 
	// precondition is not satisfied
	if (size <= 0) 
	   throw new IllegalArgumentException("WARNING: "
	        + "CANNOT create a sequence with size <= zero.");
	
	    // set the instance fields
	    this.prev = 0;  // represents the first item in the standard Fibonacci sequence
	    this.next = 1;// initialized to 1 which represents the second item in the same sequence
	    this.SIZE = size;
	    generatedCount = 0;
  }
 
  /**
   * Checks if the iteration has a next element in this sequence
   * @return true if the iteration has a next element in the sequence
   * and false otherwise
   */
  //Override hasNext() and next() methods
  @Override
  public boolean hasNext() {  // Time Complexity: O(1)
	  return generatedCount < SIZE;
  }
 
  /**
   * generates the next element in the iteration
   * @return returns the current one within that same iteration
   */
  @Override
  public Integer next() {  // Time Complexity: O(1)
	  if (!hasNext()) // check if the current element has a next element in this sequence
	      return null;
	  
	    int current = prev; // set the current element to previous
	    generatedCount++;   // increment the number of generated elements so far
	    prev = next;        // set the previous element
	    next = current + next; // set the next element (adds the current to the next)
	    return current;     // return the current number as the generated one

  }
 
  // You CAN add public accessory and mutator methods as needed here in order to implement your 
  // test methods
 
}