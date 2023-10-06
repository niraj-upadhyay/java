import java.util.Scanner;

public class SI {
    public static void main(String[] args) {

        float p,r,t,si;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount = ");
        p = sc.nextFloat();
        System.out.print("Enter the Rate = ");
        r = sc.nextFloat();
        System.out.print("Enter the Time = ");
        t = sc.nextFloat();

        si = (p*r*t)/100;

        System.out.println("The SI of the amount is = " +si);




    }
}
