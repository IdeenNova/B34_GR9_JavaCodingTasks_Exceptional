package codingTasks.madina.week1;

import org.w3c.dom.ls.LSOutput;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        System.out.println(divideWithoutOperator(10,2));
        System.out.println(divideWithoutOperator(30,-2));
        System.out.println(divideWithoutOperator(5,0));

    }


    public static int divideWithoutOperator ( int dividend, int divisor){

        //check if divisor is o
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        // check for division by one
        if (divisor == 1) {
            return dividend;
        }
        // check for division by -1
        if (divisor == -1) {
            //handle overflow case
            if (dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            return -dividend;

        }

        //Deturmine the sign of the result
        boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);

        // take the absolute value of dividend and divisor
        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);

        //initialise the quotient
        int quotient = 0;

        //keep subtracting divisor from dividend until dividend becomes less then divisor
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            quotient++;
        }
        //if the result is supposed to be negative negate it
        if (isNegative) {
            quotient = -quotient;

        }

        return quotient;

    }


}

//determine the sign of the result

 /*
Write a method that can divide two numbers without using division operator

 */