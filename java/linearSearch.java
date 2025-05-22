import java.util.*;
public class linearSearch {

    public static int LinearSearch(int number[],int key){
        for(int i = 0; i < number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int search(String menu[],String keymenu){
        for(int i = 0; i < menu.length; i++){
            if(menu[i] == keymenu){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {1,2,3,4,8,9,10,11,12,13};
        String menu[] = {"samosa","chole bhature","dosa"};
        String keymenu = "dosa";
        int key = 10;
        int index = LinearSearch(number, key);
        // if(index == -1){
        //     System.out.println("Key not found");
        // }
        // else{
        //     System.out.println("Key is at index "+index);
        // }

        int menuindex = search(menu, keymenu);
        if(menuindex == -1){
            System.out.println("Keymenu not found");
        }
        else{
            System.out.println("Keymenu found at index "+menuindex);
        }
    }
}
