//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           Jungle Park 2000
// Author:          rshen27@wisc.edu
// Lecturer's Name: Gary Dahl
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

/**
 * This class extends the provided Button class. This button has “Clear Park” as
 * label. No further fields should be added to this class. 
 * @author Shen
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



