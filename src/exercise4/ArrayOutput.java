package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      int[] numbers = new int[size];
          int space = 0;
         for(int i = 0; i<numbers.length; i++){
          numbers[i] = input.nextInt();
         for (int j = 0; j <space; j++) {
           System.out.print(" ");

           
           
          } 
         space++;
           System.out.println(numbers[i]);
         } 
          
          
          
  }
}