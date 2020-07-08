//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           Jungle Park 2000
// Author:          rshen27@wisc.edu
// Lecturer's Name: Gary Dahl
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

/**
 * This class extends the provided Button class that implements the ParkGUI interface.
 * This class defines only one instance field, and one constructor provided in the 
 * following. 
 * @author Shen
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
