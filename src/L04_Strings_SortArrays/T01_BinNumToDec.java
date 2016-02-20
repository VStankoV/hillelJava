package L04_Strings_SortArrays;

public class T01_BinNumToDec {
    public static void main(String[] args) {
        int[] num = {1,0,0,0,1,0};
        int sum = 0;
        for (int i = 0, n=num.length-1; i < num.length; i++) {
            Double d1 = (double)n;
            Double d2 = (double)num[i]*2;
            sum += Math.pow(d2, d1);
            n--;
        }
        System.out.println(sum);
    }
}
