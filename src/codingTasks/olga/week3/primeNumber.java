package codingTasks.olga.week3;

public class primeNumber {
     /*
        Write a method that can check if a number is prime or not
     */
     public static void main(String[] args) {

         int num = 17; // Change 17 to any number you want to check
         if (isPrime(num)) {
             System.out.println(num + " is a prime number.");
         } else {
             System.out.println(num + " is not a prime number.");
         }

     }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // Check from 2 to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // If divisible, not prime
            }
        }
        return true; // Otherwise, it's prime
    }

}
