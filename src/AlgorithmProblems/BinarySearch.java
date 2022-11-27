package AlgorithmProblems;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    /*Binary Search the Word from Word List
a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated from a File and then enter the word to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not*/


      public static void main(String[] args) {

            // creating ArrayList object of type String
            ArrayList<String> al = new ArrayList<String>();

            // adding elements to ArrayList object
            al.add("Rupali working on that ");
            al.add("java program");
            al.add("help");
            al.add("by using");
            al.add("classroom");
            al.add("Binary Search");

            System.out.println("Before Sorting:" + " Iterating ArrayList values\n");

            // Iterating using enhanced for-loop
            for(String str : al){
                System.out.println(str);
            }

            // sorting using Collections.sort(al);
            Collections.sort(al);

            System.out.println("\n\nAfter Sorting:" + " Iterating ArrayList values\n");

            // Iterating using enhanced for-loop
            for(String str : al){
                System.out.println(str);
            }

            // searching element from default natural ordering
            // of String type
            int iStringSearch = Collections.binarySearch(al, "Binary Search");
            System.out.println("\n\nElement found at index position "+ iStringSearch + " from Sorted ArrayList");
        }
    }

