import java.io.Console;
import java.util.*;
public class BinarySearch {
    
    public static int binarSearch(int number[], int key){
        int start = 0, end = number.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nunber[] = {2,4,6,8,10,12,14};

        Console c = System.console();

        int key = Integer.parseInt(c.readLine("Enter the element which are finds in given array: "));
        
        int searchedNumber = binarSearch(nunber, key);
        System.out.println("index of key is "+searchedNumber);
    }
}
