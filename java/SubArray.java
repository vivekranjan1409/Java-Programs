public class SubArray {

    public static void subArray(int number[]){
        // System.out.println("2");
        for(int i = 0; i < number.length; i++){
            for(int j = i ; j < number.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14};
        subArray(number);
    }
}
