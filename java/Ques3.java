import java.io.Console;

public class Ques3 {
    public static int Average(int arr[]){
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum = sum + arr[i];
        }
        int avg = sum / 10;
        return avg;
    }

    public static int Max(int arr[]){
        int max = arr[0];
        for(int i = 1; i < 10; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int Min(int arr[]){
        int min = arr[0];
        for(int i = 1; i < 10; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        Console c = System.console();
        int[] arr = new int[10];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(c.readLine(""));
        }


        int avg = Average(arr);
        System.out.println("Average of 10 number: "+avg);

        int max = Max(arr);
        System.out.println("Maximum number is "+max);
        int min = Min(arr);
        System.out.println("Maximum number is "+min);
    }
}
