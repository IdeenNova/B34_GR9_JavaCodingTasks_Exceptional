package codingTasks.ayoub.week1;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        displayValueMethod(10);
        displayValueMethod(10.0);
        displayValueMethod(2,0.6);
        displayValueMethod((double) 5,9);
        displayValueMethod(10,(double) 10);
        displayValueMethod((double) 10,10);
    }

    public static void displayValueMethod(int a){
        System.out.println("First method");

    }
    public static void displayValueMethod(double a){
        System.out.println("Second method");

    }
    public static void displayValueMethod(int a,double b){
        System.out.println("Third method");

    }
    public static void displayValueMethod(double a, int b){
        System.out.println("Fourth method");

    }

    }

