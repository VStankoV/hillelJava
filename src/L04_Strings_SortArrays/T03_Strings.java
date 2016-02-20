package L04_Strings_SortArrays;


public class T03_Strings {
    public static void main(String[] args) {
        String s = "Some string";

        char symbol = s.charAt(3);

        s.trim();           // удаляет пробелы слева и справа
        s.concat("abc");

//        s.replace();
        s.substring(2,6);   //2 - inclusive; 6 - exclusive

//        "ffd".var     //create var String

        s.equals("");

        s.split(",");

    }
}
