package L02_conditions;

/**
 * Created by Valeron on 12.02.2016.
 */
public class BlockedIf {
    public static void main(String[] args) {
        int v1 = 8, v2 = 5, diff;

        if (v1 > v2){
            System.out.println("v1 bigger");
            diff = v1 - v2;
            System.out.println("dif = " + diff);
        } else {
            System.out.println("v2 bigger");
            diff = v2 - v1;
            System.out.println("dif = " + diff);

        }




    }

}
