package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        double minnumber=0;
        int min = 0;
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        for (int index = 0; index < numbers.length; index++) {
           if(numbers[index]<minnumber){
             minnumber= numbers[index];
             min=index;
           }
           
        }
        System.out.println("Min index: "+ min);
       
    }

}
