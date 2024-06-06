package codingTasks.olga.week1;
public class DivideWithoutOperator {
    public static void main(String[] args) {

        System.out.println("division(10,5) = " + division(10, 5));
        System.out.println("division(15,3) = " + division(15, 3));

    }
    public static int division(int a, int b){
        int c = a +b;
        int result = 0;

        while (c > b){
            c = c -b;
            result++;
        }
        return result;
    }

}
/*

 */