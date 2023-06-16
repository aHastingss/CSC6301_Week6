import java.util.Scanner;
import java.util.Stack;

/**
 * Program to ask a user to input integers into a stack, storing the items into
 * a LinkedList collection and printing the values stored in incremental order. A try-catch
 * is implemented to prevent a non-integer input from the user. 
 * 
 * NOTE: This file has been revised to update the collections framework being used from LinkedList
 * to Stack
 *
 * @author Alexander Hastings
 * @since 06/10/2023
 * @version 1.2.0
 * @category Java Collections
 * @see java.util.Stack 
 * @see java.util.Scanner
 */
public class inputStack {
    /**
     * Class which initalizes a new Stack object, stores the data in Stack collections (java.util.Stack), sorts the data and 
     * prints the inputted stack along with the new sorted stack
     * @param args
     * @return None
     * {@link} https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
     */
    public static void main(String[] args) {

        // Creating a linked list object called nums
        Stack<Integer> nums = new Stack<>();

        // Creating a new scanner object and taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number (int) of items youd like to enter in the stack: ");
        
        // Initalization of a try-catch to ensure that an error is not thrown if int is not entered.
        try{
            int numInput = sc.nextInt();

            // Beginning a for loop that loops a specified number of times
            int i;
            for(i = 0; i < numInput; i++){
                System.out.println("Enter num(int) " + (i+1));
                nums.push(sc.nextInt());
            }
            // Printing the values entered 
            System.out.println("\nInital input into Stack: " + nums);

            // Sorting the linkedlist from smallest to largest
            nums.sort(null);

            // Closing the scanner and printing the results in the Stack
            sc.close();
            System.out.println("\nSorted Stack: " + nums);
        }
        
        // If input is not a int; throw an exception
        catch(Exception e){
            System.out.println("Invalid Input. Must be an int.");
        }
    }
}