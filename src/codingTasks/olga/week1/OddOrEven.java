package codingTasks.olga.week1;

public class OddOrEven {
    public static void main(String[] args) {
        oddOrEven(10);
        oddOrEven(25);

    }

    public static void oddOrEven(int num){

        if(num % 2 == 0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }

}