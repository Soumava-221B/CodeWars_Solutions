/*
Java program for multiplication of array elements
*/

import java.util.Arrays;
import java.util.Scanner;
public class m_array_elements {
   public static void main(String args[]){
      System.out.println("Enter the required size of the array :: ");
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int [size];
      int product = 1;
      System.out.println("Enter the elements of the array one by one ");
      for(int i=0; i<size; i++){
         arr[i] = sc.nextInt();
         product = product * arr[i];
      }
      System.out.println("Elements of the array are: "+Arrays.toString(arr));
      System.out.println("Sum of the elements of the array ::"+product);
   }
}