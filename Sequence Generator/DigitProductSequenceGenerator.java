/////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:      Numeric Sequence Generator
// Author:     rshen27@wisc.edu
// Lecturer's Name: Gary Dahl
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

import java.util.Iterator;
import java.util.ArrayList;

/**
 * This class represents a generator for a digit product sequence
 * this class does not implement the Iterator interface
 * We are exploring here another way how to develop a generator class for a 
 * numerical progression.
 * 
 * @author Shen
 */

class DigitProductSequenceGenerator {
	private final int INIT;              // initial number
	private final int SIZE;              // size of sequence
	private ArrayList<Integer> sequence; // ArrayList object storing the sequence
/**
 * Generates the digit product sequence
 * 
 * @param init initial value
 * @param size number of elements in the sequence
 */
 public DigitProductSequenceGenerator(int init, int size) {
	// check for the precondition: size > 0, throw an IllegalArgumentException if this 
	// precondition is not satisfied
	if (size <= 0) 
	  throw new IllegalArgumentException("WARNING: "
	       + "CANNOT create a sequence with size <= zero.");
	// check for the validity of init (>0), throw an IllegalArgumentException
	// if these two parameters are not valid 
	if(init < 0)
	  throw new IllegalArgumentException("WARNING: The starting element for digit product sequence"
	       + " cannot be less than or equal to zero.");
	    
	// set the instance fields
	this.SIZE = size;
	this.INIT = init;
    sequence = new ArrayList<Integer>();  //Generates the digit product sequence and 
    // stores its content into sequence.
	generateSequence();
 }
 
 /** 
  * Generate the digit sequence with first element init and size size using loop(s)
  * using for loop(s) to implement this method
  */
 public void generateSequence() {
   // TODO Generate the DigitProduct sequence using loop(s)
   
   sequence = new ArrayList<Integer>(); // clear the arrayList content first
   Integer now = INIT; // get the initial value
   
   // adding the content of the new sequence to generate
   for (int i = 0; i < SIZE; i++) {
     sequence.add(now);
     int pro = 1; // set the value of product to 1
     String[] nowString = now.toString().split(""); 
     for (int j = 0; j < nowString.length; j++) {
       int temp = Integer.parseInt(nowString[j]); 
       // transforming String to integer
       if (temp == 0)
         temp = 1;
       pro *= temp; 
     }
     
     now += pro; 
   }
 }
 

 /** 
  * @return an Iterator other the generated sequence stored in the 
  * ArrayList sequence
  */
 public Iterator<Integer> getIterator() {
	// TODO return an Iterator to iterate over the ArrayList sequence field
   return sequence.iterator();
 }
 
 public ArrayList<Integer> getSequence() {
   return sequence;
 }
}

