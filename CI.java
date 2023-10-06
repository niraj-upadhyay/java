import java.util.Scanner;
import static java.lang.Math.pow;

public class CI {

    public static void main(String[] args) {
        float p,r,t,ci;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount = ");
        p = sc.nextFloat();
        System.out.print("Enter the Rate = ");
        r = sc.nextFloat();
        System.out.print("Enter the Time = ");
        t = sc.nextFloat();

        ci = (float) (p*(pow((1 + r / 100), t)));

        System.out.println("The CI of the amount is = " +ci);


    }



}
