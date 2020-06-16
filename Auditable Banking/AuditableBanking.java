//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           AuditableBanking App
// Files:           None
// Course:          Comp Sci 300, LEC-001, Fall 2018
//
// Author:          Ruoxi Shen
// Email:           rshen27@wisc.edu
// Lecturer's Name: Dahl,Gary 
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

import java.util.Scanner;

public class AuditableBanking {

/**
 * Adds a transaction group to an array of transaction groups. If the allTransactions array is
 * already full then this method will do nothing other than return allTransactionCount.
 * 
 * @param newTransactions is the new transaction group being added (perfect size).
 * @param allTransactions is the collection that newTransactions is being added to (oversize).
 * @param allTransactionsCount is the number of transaction groups within allTransactions 
 *        (before newTransactions is added).
 * @return the number of transaction groups within allTransactions after newTransactions is added.
 */
public static int submitTransactions( int[] newTransactions, int[][] allTransactions, 
		int allTransactionsCount) {
	// Check if the allTransactions array is already full
	if( allTransactionsCount < allTransactions.length )                     
		{
		allTransactions[ allTransactionsCount ] = newTransactions;
		allTransactionsCount++;         
	}
  return allTransactionsCount;
}

/**
 * 
 * @param command
 * @param allTransactions
 * @param allTransactionsCount
 * @return allTransactions
 */
public static int processCommand( String command, int[][] allTransactions, 
		int allTransactionsCount) {
	if ( allTransactionsCount < allTransactions.length ) {
		    // Split the input strings and store them into a string array
            String SplitValues[] = command.split(" ");
            // if we get input b or B, output the current balance
            if( SplitValues[0].equals("B") || SplitValues[0].equals("b") ) {
            	System.out.println("Current Banlance:" + calculateCurrentBalance(allTransactions, allTransactionsCount));
            }
            // if we get input b or B, output the number of overdrafts
            else if( SplitValues[0].equals("O") || SplitValues[0].equals("o") ) {
            	System.out.println("Number of Overdrafts:" + calculateNumberOfOverdrafts(allTransactions, allTransactionsCount));
            }
            else if( SplitValues[0].equals("Q") || SplitValues[0].equals("q") ) {
            	System.out.println("============ Thank you for using this App!!!! ============");
            	allTransactionsCount = -1 ;
            }
            // if we get a new transactions, we submit it into the transaction group
            else {
            	int newTransaction[] = new int[SplitValues.length]; 
            	for (int i = 0; i < newTransaction.length; i++) {
            		// covert the string within command to integers elements and add them into the new array
            		newTransaction[i] = Integer.parseInt(SplitValues[i].trim());
            		}
            	// calling the submit method
            	allTransactionsCount = submitTransactions(newTransaction, allTransactions, allTransactionsCount);
      }
	}
      return allTransactionsCount; 
}

/**
 * 
 * @param allTransactions
 * @param allTransactionsCount
 * @return
 */
public static int calculateCurrentBalance(int[][] allTransactions, int allTransactionsCount) {
	int balance = 0;
	
	  for(int i = 0; i< allTransactionsCount; i++) {
		  if(allTransactions[i][0] == 0) {
			  for (int j = 1; j< allTransactions[i].length; j++) {
				  if(allTransactions[i][j] == 0)
					  balance --;
				  if(allTransactions[i][j] == 1)
					  balance ++;
			  }
		  }
		  if(allTransactions[i][0] == 1) {
			  for (int j = 1; j< allTransactions[i].length; j++) {
				  balance += allTransactions[i][j];
			  }
		  }
		  if(allTransactions[i][0] == 2) {
			  balance = balance -allTransactions[i][1]*20 - allTransactions[i][2]*40 - allTransactions[i][3]*80 - allTransactions[i][4]*100;
		  }
	  }
	  
	  return balance;
	}

/**
 * 
 * @param allTransactions
 * @param allTransactionsCount
 * @return
 */
public static int calculateNumberOfOverdrafts(int[][] allTransactions, int allTransactionsCount) {
	 int balance =0 ;  
	 int overdrafts = 0;
	 for(int i = 0; i< allTransactionsCount; i++) {
		  if(allTransactions[i][0] == 0) {
			  for (int j = 1; j< allTransactions[i].length; j++) {
				  if(allTransactions[i][j] == 0) {
					  balance --;
					  if( balance < 0) 
						  overdrafts ++;
					  }
				  if(allTransactions[i][j] == 1) {
					  balance ++;
					  if( balance < 0) 
						  overdrafts ++;
					  }
			  }
		  }
		  if(allTransactions[i][0] == 1) {
			  for (int j = 1; j< allTransactions[i].length; j++) {
				  balance += allTransactions[i][j];
				  if( balance < 0) 
					  overdrafts ++;
				  }
		  }
		  if(allTransactions[i][0] == 2) {
			  for(int j = 0; j < allTransactions[i][1]; j++){
				  balance -= 20;
				  if( balance < 0) 
					  overdrafts ++;
			  }
			  for(int j = 0; j < allTransactions[i][2]; j++){
				  balance -= 40;
				  if( balance < 0) 
					  overdrafts ++;
			  }
			  for(int j = 0; j < allTransactions[i][3]; j++){
				  balance -= 80;
				  if( balance < 0) 
					  overdrafts ++;
			  }
			  for(int j = 0; j < allTransactions[i][4]; j++){
				  balance -= 100;
				  if( balance < 0) 
					  overdrafts ++;
			  }
		  }
	  }
	  return overdrafts;
 }


/**
 * 
 */
public static void main(String arg[]) {
	int[][] allTransactions= new int[500][];
	int allTransactionsCount = 0;
	Scanner scnr = new Scanner(System.in);
	do{
	System.out.println("========== Welcome to the Auditable Banking App ==========" +
			"  COMMAND MENU:\n" + 
			"  Submit a Transaction (enter sequence of integers separated by spaces)\n" + 
			"  Show Current [B]alance\n" + 
			"  Show Number of [O]verdrafts\n" + 
			"  [Q]uit Program\n" + 
			"ENTER COMMAND: ");
	String Input = scnr.nextLine();
	allTransactionsCount = processCommand(Input, allTransactions, allTransactionsCount);
	}while(allTransactionsCount != -1);
}
}

	


