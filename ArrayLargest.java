import java.util.*;
public class ArrayLargest {

    public static int Largest(int number[]){
        int largest = number[0];
        for(int i = 0; i < number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static int smallest(int number[]){
        int smallest = number[0];
        for(int i = 0; i < number.length; i++){
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int number[] = {10,20,14,13,9,34,23};
        int large = Largest(number);
        int small = smallest(number);
        System.out.println("Largest number is "+large);
        System.out.println("Largest number is "+small);

       
    }
}
