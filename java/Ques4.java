import java.io.Console;

public class Ques4 {

    public static void Ascending(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted number in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void Descending(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted number in Descending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Console c = System.console();

        int size = Integer.parseInt(c.readLine("Enter the Size of Array: "));
        int[] arr = new int[size];
        System.out.println("Enter the Array Element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(c.readLine(""));
        }

        Ascending(arr);
        Descending(arr);

    }
}
