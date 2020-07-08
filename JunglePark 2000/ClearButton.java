//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           Jungle Park 2000
// Files:           JunglePark.java, ParkGUI.java, Animal.java, Tiger.java, Deer.java, 
//                  AddAnimalButton.java, ClearButton.java, and JungkeParkTests.java
// Course:          CS 300, Fall 2018
//
// Author:          Ruoxi Shen
// Email:           rshen27@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:    (name of your pair programming partner)
// Partner Email:   (email address of your programming partner)
// Partner Lecturer's Name: (name of your partner's lecturer)
// 
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//   ___ Write-up states that pair programming is allowed for this assignment.
//   ___ We have both read and understand the course Pair Programming Policy.
//   ___ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates, 
// strangers, and others do.  If you received no outside help from either type
//  of source, then please explicitly indicate NONE.
//
// Persons:         NONE
// Online Sources:  NONE
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

/**
 * This class extends the provided Button class. This button has “Clear Park” as
 * label. No further fields should be added to this class. 
 * @author Ruoxi Shen
 *
 */
public class ClearButton extends Button {
  // The ClearButton class constructor should have the following signature: 
  public ClearButton(float x, float y, JunglePark park) {
	  
      super(x, y, park);
      this.label = "Clear Park"; // “Clear Park” as label 
  }
   
 @Override
 
  public void mousePressed() {
    if (isMouseOver()) {
      processing.clear(); // all the animal objects must be removed from the park.
    }
  }
}



