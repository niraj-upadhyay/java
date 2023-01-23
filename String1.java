import java.sql.SQLOutput;

public class String1 {

    public static void main(String[] args) {
        String name = "Harry" ;
        System.out.println(name);

        //  length() ------> Returns the length of String name

//        int value = name.length();
//        System.out.println(value);

       // toLowerCase() ------> Converts all the characters of the string to the lower case letters.

//        String lstring = name.toLowerCase();
//        System.out.println(lstring);

        //toUpperCase() -----> Converts all the characters of the string to the upper case letters.

//        String ustring = name.toUpperCase();
//        System.out.println(ustring);

        // trim() -----> Returns a new String after removing all the leading spaces from the original string.

//        String nonTrimmedstring  = "      Harry      ";
//        System.out.println(nonTrimmedstring);
//
//        String trimstring = nonTrimmedstring.trim();
//        System.out.println(trimstring);

       // substring(int start) ----> Returns a substring from start to the end(index start from 0)

//        System.out.println(name.substring(4));
//        System.out.println(name.substring(1,4));

        //replace(‘r’, ‘p’) ----> Returns a new string after replacing r with p.

//        System.out.println(name.replace('r', 'p'));
//        System.out.println(name.replace("r", "ier"));

        //startsWith(“Ha”) ----> 	Returns true if the name starts with the string “Ha”.

//        System.out.println(name.startsWith("Har"));

        //endsWith(“ry”) ----> Returns true if the name ends with the string “ry”

//        System.out.println(name.endsWith("Har"));


       // equals(“Harry”) ----> Returns true if the given string is equal to “Harry” otherwise return false;

//        System.out.println(name.equals("Harry"));

        //equalsIgnoreCase(“harry”) ------> It ignore the cases;

        System.out.println(name.equalsIgnoreCase("HarRY"));






    }
}
