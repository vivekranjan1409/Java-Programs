
import java.util.*;
public class arrayList {

    public static class Arraylist{
        int[] arr = new int[5];
        int idx = 0;
        int size = 0;
        public void add(int ele){

            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr, arr.length*2);
                arr = brr;
                // arr = new int[brr.length];
                // arr = Arrays.copyOf(brr, brr.length*2);
            }
            arr[idx] = ele;
            idx++;
            size++;
        }

        public void set(int idx,int val){
            arr[idx] = val;
        }
    }
    public static void main(String[] args) {

        Arraylist arr = new Arraylist();
        arr.add(2); 
        arr.add(3);
        System.out.println(arr.size);
        arr.add(3);
        System.out.println(arr.size);
        

        arr.set(0,20);




        // ArrayList<Integer> arr = new ArrayList<>(4);

        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(5);
        // arr.add(4);
        // arr.set(1,20);
        // System.out.println(arr.size());
        // System.out.println(arr);
    }
    
}
