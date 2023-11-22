/*
Ninja is good at numbers. So today his friend gave him a task that required him to find out numbers made of 2 and 5 only less than a given limit. Given an integer N, you need to print all numbers less than N which are having digits only 2 or 5 both.
*/

import java.util.Scanner;

public class number2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 10 == 2 || i % 10 == 5) {

                int num = i;
                while (num > 0) {
                    int digit = num % 10;
                    if (digit != 2 && digit != 5) {
                        break;
                    }
                    num = num / 10;
                }

                if(num == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}