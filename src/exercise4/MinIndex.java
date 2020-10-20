package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        double minnumber;
        int min = 0;
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
           if(numbers[i]<a[min]){
             min=;
           }
           
        }
        System.out.println("Min number: " + min);
       
    }

}
