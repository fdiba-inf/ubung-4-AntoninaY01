package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        double max = 0;
for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
           if(numbers[i]>max){
             max=numbers[i];
           }
           
        }
        System.out.println("Max number: " + max);
       
    }

}
