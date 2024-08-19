package sprachkern;

/**
 * wrapperklassen
 * <p>
 *
 * @author Maximilian Stolle
 * @version 19.08.2024
 */
public class Wrapperklassen {
    public static void main(String[] args) {

        int primitiv = 123;
        Integer objekt; // Objektreferenztyp

        // String -> int
        String s = "4711"; // Objektreferenztyp
//        int x  = (int)s; //Inconvertible types; cannot cast 'java.lang.String' to 'int'

        int x = Integer.parseInt(s);
        System.out.println(x);

        // String -> double
        s = "12345.6789";
        double d = Double.parseDouble(s);
        System.out.printf("%,.2f",d);

        System.out.println();

        // Konstanten
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE + " Bit");
        System.out.println(Integer.BYTES + " Bytes");

        // int -> String
        s = "abc" + x; // = "abc" + "4711" = "abc4711"
        s = String.format("%d", x);
        System.out.println(Integer.toString(x));
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toOctalString(x));

        // String -> boolean
        s  = "true";
        boolean b = Boolean.parseBoolean(s);
        System.out.println(s);

        /*
            Character
        */
        char a = 'A';
        char c = '\n';
        char y = ' ';
        System.out.println(Character.isDigit(a));
        System.out.println(Character.isWhitespace(c));
        System.out.println(Character.isLetter(y));

        c = '5';
//        x = 10 * c; // wird nicht mit 5 mal genommen sondern mit dem fünften ASCII Zeichen Konkateniert
        x = 10 * Character.getNumericValue(c); // 50
        System.out.println(x);
    }
}
