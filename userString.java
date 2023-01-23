import java.util.Scanner;
public class userString {

    public static void main(String[] args) {

//        String st = "Tukika " ;
//        System.out.println(st);

        //System.out.println("Enter the name");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
       String st = sc.next(); // next ----> print only one word , It is not print after space.
        // nextLine -----> It print All the word
        //String st = sc.nextLine();

        System.out.println(st);
    }





}
