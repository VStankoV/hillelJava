package L03_Cycles;


public class ForLoopByArray {
    public static void main(String[] args) {
        int[] array = {1,2,56,3};

/*
        //break - stop loop
        //continue - next iteration

        int sum = 0;
//        for (int i = 0; i < array.length; i++){
//            sum = array[i];
//        }

//        System.out.println(sum);

        for (int i : array ) {
            sum +=i;
        }

        System.out.println(sum);
*/

        int min = array[0];

        for (int i : array ) {
            if (i < min){
                min = i;
            }
        }



    }
}
