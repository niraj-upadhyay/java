
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {

        int r;
        int d;
        int a;
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle = ");
        r=sc.nextInt();
        d=r*2;
        c= 2*3.17*r;
        a=r*r;

        System.out.println("Diameter of the circle is = "+d);
        System.out.println("circumference of the circle is = "+c);
        System.out.println("Area of the circle is = "+a);
    }

}
