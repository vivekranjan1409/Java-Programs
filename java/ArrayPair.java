public class ArrayPair {

    public static void pair(int number[]){
        int tp = 0;
        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j < number.length; j++){
                System.out.print("("+number[i]+","+number[j]+") ");
                tp++;
            }
            System.out.println("");
        }
        System.out.println("Total Pairs: "+tp);
    }
    public static void main(String args[]){
        int number[] = {2,3,4,5,6};
        pair(number);
    }
}
