
// WAP to  find power of a number using pow function

import java.lang.Math;
import java.util.Scanner;
public class power {

    public static void main(String[] args) {

        int b,p,ex;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base = ");
        b=sc.nextInt();
        System.out.print("Enter the power = ");
        p = sc.nextInt();

        ex= (int) Math.pow(b,p);

        System.out.println("The power is = " +ex);


    }



}
