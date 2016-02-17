package L03_Cycles;

public class ArrayExmp {
    public static void main(String[] args) {

//        int[] array = new int[3];
//        array[0] = 0;
//        array[1] = 1;
//        array[2] = 2;

        int[] array = {1,2,56,3};



        int i = 0;
        int sum = 0;
        while (i < array.length){
            sum += array[i++];
        }

        System.out.println(sum);



    }
}
