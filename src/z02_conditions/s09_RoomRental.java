package z02_conditions;

/**
 * Created by Valeron on 12.02.2016.
 */
public class s09_RoomRental {
    public static void main(String[] args) {

        int days = 7;

        if (days < 4) {
            System.out.println("Price = " + days * 40);
        } else if (days < 8){
            System.out.println("Price = " + (days * 40 - 20));
        } else {
            System.out.println("Price = " + (days * 40 - 50));
        }


        int disc = days < 4 ? 0 : days < 8 ? 20 : 50;




    }

}
