package codingTasks.madina.week1;
public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(identify(5)); //output Odd
        System.out.println(identify(6)); //output Even

    }
    public static String identify(int number){ //the method identifies if the number is divisible by 2 if yes returns "Even", if no returns "Odd"
        if (number % 2 == 0){
            return "Even";

        }else{
            return "Odd";
        }
    }
}
    /*
Write a method which can identifies given number is even or odd.
 Ex:
     idenitify(5) -> "Odd"
     idenitify(6) -> "Even"
 */