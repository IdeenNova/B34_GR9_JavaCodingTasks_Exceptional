package codingTasks.mentor.week1;

public class Finra {
    public static void main(String[] args) {

        String result = " ";

        // for going through each number from 1 -30 we need a for loop
        for (int i = 0; i <= 30; i++){
            //then we use if statement to process further requirements
            if (i % 3 == 0 && i % 5 == 0){ // if the number is multiple of three and 5
                System.out.println("FINRA");

            } else if (i % 3 == 0) {
                System.out.println("FIN"); // if the number is multiple of 3
            } else if (i % 5 == 0) { // if the number is multiple of 5
                System.out.println("RA");
            }else {
                System.out.println(" "); // if none of the amount empty String
            }

            System.out.println(result); // print result


        }
    }

    /*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */

}