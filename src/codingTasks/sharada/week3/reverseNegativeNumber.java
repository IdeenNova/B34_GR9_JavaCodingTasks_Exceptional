package codingTasks.sharada.week3;

import java.util.Scanner;

public class reverseNegativeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a negative number to reverse it to a positive number");
        int negative = in.nextInt();

        System.out.println(ReverseNegativeNumber(negative));

    }
    public static int ReverseNegativeNumber(int negative){

        int positive = 0;
        if(negative < 0){
            positive = negative*(-1);
        }else{
            positive = negative;
        }
        return positive;
    }
    //Write a return method that can reverse negative number and return it as int
    //ex: given int is ==> -53
    //  the output will be ==> -35

}

