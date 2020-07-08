/////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: SJF PROCESS SCHEDULER
// Files: WaitingQueueADT.java, CustomProcess.java, CustomProcessQueue.java, 
// ProcessScheduler.java, and ProcessSchedulerTests.java
// Course: CS 300, Fall 2018
//
// Author:         Ruoxi Shen
// Email:          rshen27@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:    Yuanbo Zhang
// Partner Email:   yzhang2325@wisc.edu
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
//////////////////////////////////////// 100 COLUMNS WIDE /////////////////////////////////////////

/**
 * The class is used to test the functions of ProcessScheduler.
 * This class has multiple test methods, each test focuses on a specific method, check whether 
 * the result is exactly what we expect. 
 */
public class ProcessSchedulerTests {
  
  /**
   * checks the correctness of the enqueue 
   * operation implemented in the CustomProcessQueue class
   * 
   * @return true if pass the test, false otherwise
   */
  public static boolean testEnqueueCustomProcessQueue() {
    CustomProcessQueue testQueue = new CustomProcessQueue();
    CustomProcess task1 = new CustomProcess(1);
    CustomProcess task2 = new CustomProcess(2);
    CustomProcess task3 = new CustomProcess(2);
    testQueue.enqueue(task3);
    testQueue.enqueue(task2);
    testQueue.enqueue(task1);
    
    if (testQueue.isEmpty()) // queue should not be empty now
      return false;
    if (testQueue.peek().getProcessId() != 1 || testQueue.peek().getBurstTime() != 1)
      return false;
    return true;
  }
  
  /**
   * checks the correctness of the dequeue 
   * operation implemented in the CustomProcessQueue class
   * 
   * @return true if pass the test, false otherwise
   */
  public static boolean testDequeueCustomProcessQueue(){
    CustomProcessQueue testQueue = new CustomProcessQueue();
    CustomProcess task1 = new CustomProcess(1);
    CustomProcess task2 = new CustomProcess(2);
    CustomProcess task3 = new CustomProcess(2);
    testQueue.enqueue(task1);
    testQueue.enqueue(task3);
    testQueue.enqueue(task2);
    testQueue.dequeue();
    testQueue.dequeue();
    
    if (testQueue.isEmpty()) // queue should not be empty now
      return false;
    if (testQueue.peek().getProcessId() != 6 || testQueue.peek().getBurstTime() != 2)
      return false;
    return true;
  }
  
  /**
   * checks the correctness of the size
   * operation implemented in the CustomProcessQueue class
   * 
   * @return true if pass the test, false otherwise
   */
  public static boolean testSize(){
    CustomProcessQueue testQueue = new CustomProcessQueue();
    CustomProcess task1 = new CustomProcess(1);
    CustomProcess task2 = new CustomProcess(2);
    CustomProcess task3 = new CustomProcess(2);
    testQueue.enqueue(task3);
    testQueue.enqueue(task2);
    testQueue.enqueue(task1);
    
    if (testQueue.size() != 3) // size should be 3
      return false;
    return true;
  }
  
  /**
   * checks the correctness of the isEmpty
   * operation implemented in the CustomProcessQueue class
   * 
   * @return true if pass the test, false otherwise
   */
  public static boolean testIsEmpty(){
    CustomProcessQueue testQueue = new CustomProcessQueue();
    CustomProcess task1 = new CustomProcess(1);
    CustomProcess task2 = new CustomProcess(2);
    testQueue.enqueue(task1);
    testQueue.enqueue(task2);
    testQueue.dequeue();
    testQueue.dequeue();
    
    if (!testQueue.isEmpty()) // queue should be empty
      return false;
    return true;
  }
  
  /**
   * Testing main. Runs each test and prints which (if any) failed. If no problem occurs, print a
   * single line showing "All tests passed!".
   */
  public static void main(String[] args) {
    boolean passed = true;
    if (!testEnqueueCustomProcessQueue()) {
      System.out.println("testEnqueueCustomProcessQueue failed");
      passed = false;
    }
    if (!testDequeueCustomProcessQueue()) {
      System.out.println("testEnqueueCustomProcessQueue failed");
      passed = false;
    }
    if (!testSize()) {
      System.out.println("testSize failed");
      passed = false;
    }
    if (!testIsEmpty()) {
      System.out.println("testIsEmpty failed");
      passed = false;
    }
    // If no problem occurs, print a single line showing "All tests passed!".
    if (passed)
      System.out.println("All tests passed!");
  }
}
