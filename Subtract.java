import java.util.Scanner;
public class Subtract {
    public static void main(String[] args)
    {
        System.out.println("Subtraction of two number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();
        int sub = a-b;
        System.out.println(sub);

    }

}
