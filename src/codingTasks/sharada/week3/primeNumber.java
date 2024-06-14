package codingTasks.sharada.week3;

import java.util.Scanner;

public class primeNumber {

    public static class PrimeNumber {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Please enter a prime number:");
            int prime = in.nextInt();

            Prime(prime);
        }
    }

        public static void Prime(int prime) {
            String result = "";
            if (prime == 2 || prime == 3 || prime == 5 || prime == 7) {
                result = prime + " is a prime number";
            } else if (prime % 2 != 0 && prime % 3 != 0 && prime % 5 != 0 && prime % 7 != 0 && prime % 9 != 0) {
                result = prime + " is a prime number";
            } else {
                result = "It's not a prime number.";
            }
            System.out.println(result);
        }
}

     /*
        Write a method that can check if a number is prime or not
     */


