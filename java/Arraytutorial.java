// Array :- Array is a data structure which stores a collection of homogeneous items.
// array indexing starting frem index 0.
import java.util.Scanner;
public class Arraytutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < arr.length; i++){
            // System.out.println("");
            arr[i] = sc.nextInt();
        }  

        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
}
