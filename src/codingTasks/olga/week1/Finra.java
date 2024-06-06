package codingTasks.olga.week1;

public class Finra {
    public static void main(String[] args) {

        finra(1,30);
        System.out.println("*************");
        finra(10,40);
    }

    public static void finra(int start, int end){

        for (int i = start; i <= end; i++) {

            boolean by3 = i % 3 == 0;
            boolean by5 = i % 5 == 0;

            if (by3 && by5){
                System.out.println("FINRA");
            } else if (by3) {
                System.out.println("FIN");
            } else if (by5) {
                System.out.println("RA");
            }else {
                System.out.println(i);
            }
        }
    }


}