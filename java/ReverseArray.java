public class ReverseArray {

    public static void reverse(int number[]){
        int first = 0 , last = number.length - 1;

        while(first < last){
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int number[] = {2,3,4,5,6,7};
        reverse(number);
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i]+" ");
        }
    }
}

