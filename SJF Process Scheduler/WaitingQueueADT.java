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
 * This interface define the Abstract Data Type that represents 
 * the pattern for our ready processes waiting list
 * this is a generic within comparable interface
 */
public interface WaitingQueueADT<T extends Comparable<T>> {

  /**
   * inserts a newObject in the priority queue
   * 
   * @param newObject: newObject to be added to this queue.
   */
  public void enqueue(T newObject);

  /**
   * removes and returns the item with the highest priority
   * 
   * @return the item with the highest priority
   */
  public T dequeue();

  /**
   * returns without removing the item with the highest priority
   * 
   * @return the item with the highest priority
   */
  public T peek();

  /**
   * returns size of the waiting queue
   * 
   * @return size of the waiting queue
   */
  public int size();

  /**
   * checks if the waiting queue is empty
   * 
   * @return true if the queue is empty, false otherwise.
   */
  public boolean isEmpty();
}
