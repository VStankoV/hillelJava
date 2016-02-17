package L02_conditions.HomeWork;

public class FindMax {
    public static void main(String[] args) {
        //Найти максимальное из трёх чисел
        int n1 = 1, n2 = 5, n3 = 9;

        int max = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.print("Максимальное чило: "+max);



    }
}
