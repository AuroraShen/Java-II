/////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           Access Control
// Files:           AccessControl.java, User.java, AccessControlTest.java
// Course:          CS 300, Fall 2018
//
// Author:          Ruoxi Shen
// Email:           rshen27@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:     Yuanbo Zhang
// Partner Email:    yzhang2325@wisc.edu
// Partner Lecturer's Name:  Gary Dahl
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
// Persons:              NONE
// Online Sources:       NONE
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

/**
 * The class User specifies a type of objects that have access to the presupposed system. Each User
 * object has a unique combination of username, password, and whether it is an administrator or not.
 * 
 * Note that the USERNAME field is final, it could not be changed once the object is initialized.
 * All three fields are private, so they could not be accessed outside this class. Thus the user 
 * information is protected.
 * 
 * This class provides a initializer and 5 methods, each of the methods in turn has following 
 * functions:
 * 
 * isValidLogin: Comparing the provided password parameter with its own password field. 
 *               If matching, return true; if not, return false.
 * 
 * getUsername: Returning the USERNAME field.
 *         
 * getIsAdmin: Returning true if the user is an administrator; return false if not.
 * 
 * setPassword: Changing the password to provided new password.
 * 
 * setIsAdmin: Setting the identity of a user. If the parameter "isAdmin" is true, set the user as
 * administrator; if false, set the user as non-administrator.
 */
public class User {
  
  //This USERNAME field is final, once an object is initialized, USERNAME becomes immutable.
  private final String USERNAME; 
  
  private String password;
  
  private boolean isAdmin;
  
  //Creates a new user with the given username, password and admin status
  public User(String username, String password, boolean isAdmin) {
    // Once we assign a value to this final field USERNAME, it becomes immutable.
    USERNAME = username;
    // We use prefix "this" to distinguish between the field of the class and the parameter
    this.password = password;
    this.isAdmin = isAdmin;
  }
  
  //Report whether the password is correct. If correct, return true; if not, return false.
  public boolean isValidLogin(String password) {
    // We use .euqals() method to compare the String values, not the address of the objects.
    if (this.password.equals(password)) 
      return true;
    else
      return false;
  } 
  
  //Return the user's name
  public String getUsername() {
    return USERNAME;
  } 
  
  //Report whether the user is an admin. If so, return true; if not, return false.
  public boolean getIsAdmin() {
    return isAdmin;
  } 
  
  //Set the new password
  public void setPassword(String password) {
    this.password = password;
  } 
  
  //Set the new admin status
  public void setIsAdmin(boolean isAdmin) {
    this.isAdmin = isAdmin;
  } 
  
  public static void main (String arg[]) {
    
  }
}
