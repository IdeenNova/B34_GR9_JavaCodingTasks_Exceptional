package codingTasks.madina.week8;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/
    public static void main(String[] args) {

        //declare and initialize an array
        int[] nums = new int[]{1, 0, 2, 0, 3, 0, 4, 0};

        //declare a variable idx and initialise it to 0
        int idx = 0;


        for (int i = 0; i < nums.length; i++) {

            //checking if the element belonging to the vertical iteration is not equal to zero
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
                //the above part of code will bring all nonzero elements together one after another maintaining same order

            }
        }
        for (int j = idx; j < nums.length; j++) {
            nums[j] = 0;
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + ",");

        }
    }
}

