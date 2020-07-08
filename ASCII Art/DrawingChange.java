/////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: ASCII ART
// Files: DrawingStack.java, DrawingStackIterator.java, DrawingChange.java, Canvas.java,
// AsciiArt.java, and AsciiTest.java
// Course: CS 300, Fall 2018
//
// Author: Ruoxi Shen
// Email:  rshen27@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:  Yuanbo Zhang
// Partner Email: yzhang2325@wisc.edu
// Partner Lecturer's Name: Gary Dahl
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
// Persons: NONE
// Online Sources: NONE
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

/**
 * This class records the details of a single change made to the canvas This type 
 * of objects are used as data of the nodes in the DrawingStack
 */

public class DrawingChange {
	public final int x; // x coordinate for a change
	public final int y; // y coordinate for a change
	public final char prevChar; // previous character in the (x,y)
	public final char newChar; // new character in the (x,y)

	/**
	 * constructor of the DrawingChange
	 * 
	 * @param x: x coordinate for a change
	 * @param y: y coordinate for a change
	 * @param prevChar: previous character in the (x,y)
	 * @param newChar: new character in the (x,y)
	 */
	
	public DrawingChange(int x, int y, char prevChar, char newChar) {
	  this.x = x;
	  this.y = y;
	  this.prevChar = prevChar;
	  this.newChar = newChar;
	}
}
