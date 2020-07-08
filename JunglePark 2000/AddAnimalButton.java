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
 * This class extends the provided Button class that implements the ParkGUI interface.
 * This class defines only one instance field, and one constructor provided in the 
 * following. 
 * @author Ruoxi Shen
 *
 */
public class AddAnimalButton extends Button {
  private String type; // type of the animal to add
  
  public AddAnimalButton(String type, float x, float y, JunglePark park) {
      super(x, y, park);
      this.type = type.toLowerCase(); // switch to lower letters
      this.label = "Add " + type;
  }
   
 @Override
  public void mousePressed() {
    if (isMouseOver()) {
      switch (type) {
        case "tiger":
           // set a new tiger
          processing.listGUI.add(new Tiger(processing));
          break;
        case "deer":
           // set a new deer
          processing.listGUI.add(new Deer(processing));
          break;
      }
    }
  }
}
