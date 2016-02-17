package L02_conditions;

public class s01_Minimum {
    static int go (int i){
        return i;
    }
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        int n3 = 2;

        int rez = n1 > n2 ? go(n1) : n2 > n3 ? go(n2) : go(n3);     //тернарный всегда чтото возвращает
        System.out.println(rez);

//        if (n1 > n2){
//            if (n2>n3){
//                System.out.println(n3);
//            } else System.out.println(n2);
//        } else {
//            if (n1 > n3){
//                System.out.println(n3);
//            } else System.out.println(n1);
//        }





    }




}
