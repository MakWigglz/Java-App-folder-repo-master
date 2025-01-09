// Java program to find an element in an Array. 
import java.util.Arrays;
import java.util.stream.IntStream;

class GFG {
// function return True if found element.
    private static boolean check(int[] arr, int toCheckValue)
    {
       boolean test=false;  
       for(int element : arr) {
           if (element == toCheckValue) {
                test = true;
                break; 
        }
      }
      return test;
    }
    public static void main(String[] args) {
        int[] arr = IntStream.rangeClosed(1,300).toArray();

        System.out.println("The Array of 300 numbers is: " + Arrays.toString(arr));
        int toCheckValue = 150;
        boolean found = check(arr, toCheckValue);
        if (found) {
            System.out.println("the element " + toCheckValue + "is present in the aray");
        } else {
            System.out.println("the element" + toCheckValue + " is not present in the array");
        }
    }
}
