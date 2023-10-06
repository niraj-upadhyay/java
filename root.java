import java.util.Scanner;
import static java.lang.Math.sqrt;

public class root {

    public static void main(String[] args) {

        double num ,root;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        num = sc.nextInt();

        root = sqrt(num);
        System.out.println("The square root = " +root);



    }


}
