package z02_HomeWork;

/**
 * Created by Valeron on 16.02.2016.
 */
public class FindMinimum {
    public static void main(String[] args) {
        int n1 = 5, n2 = 3, n3 = 8;

        if (n1 < n2) {
            if (n1 < n3) {
                System.out.println("min is " + n1);
            } else if (n1 == n3) {
                System.out.println("min is " + n1 + " and " + n3);
            } else System.out.println("min is " + n3);
        } else if (n1 == n2) {
            if (n2 < n3) {
                System.out.println("min is " + n1 + " and " + n2);
            } else if (n2 == n3) {
                System.out.println("min is " + n1 + ", " + n2 + " and " + n3);
            } else System.out.println("min is " + n3);
        } else if (n2 < n3) {
            System.out.println("min is " + n2);
        } else if (n2 == n3) {
            System.out.println("min is " + n2 + " and " + n3);
        } else System.out.println("min is " + n3);
    }


}

