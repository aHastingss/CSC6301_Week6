import java.util.LinkedList;
import java.util.Scanner;

/**
 * Program to ask a user to input integers into a linked list, storing the items into
 * a LinkedList collection and printing the values stored in incremental order. A try-catch
 * is implemented to prevent a non-integer input from the user. 
 *
 * @author Alexander Hastings
 * @since 06/05/2023
 * @version 1.1.0
 * @category Java Collections
 * @see java.util.LinkedList 
 * @see java.util.Scanner
 */
public class intputLinkedList {
    /**
     * Class which initalizes a new LinkedList object, stores the data in LinkedList collections (java.util.LinkedList), sorts the data and 
     * prints a sorted list from smallest to largest.
     * @param args
     * @return None
     * {@link} https://www.java67.com/2016/02/how-to-sort-linkedlist-in-java-example.html#:~:text=sort()%20in%20Java,are%20sorted%20in%20chronological%20order
     */
    public static void main(String[] args) {

        // Creating a linked list object called nums
        LinkedList<Integer> nums = new LinkedList<>();

        // Creating a new scanner object and taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number (int) of items youd like to enter in the linked list: ");
        
        // Initalization of a try-catch to ensure that an error is not thrown if int is not entered.
        try{
            int numInput = sc.nextInt();

            // Beginning a for loop that loops a specified number of times
            int i;
            for(i = 0; i < numInput; i++){
                System.out.println("Enter num(int) " + (i+1));
                nums.add(sc.nextInt());
            }

            // Sorting the linkedlist from smallest to largest
            nums.sort(null);

            // Closing the scanner and printing the results in the linked list
            sc.close();
            System.out.println("\nItems in Linked List: " + nums);
        }
        
        // If input is not a int; throw an exception
        catch(Exception e){
            System.out.println("Invalid Input. Must be an int.");
        }
    }
}