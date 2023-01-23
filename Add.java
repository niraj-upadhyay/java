import java.util.Scanner;
public class Add {

//    public static void main(String[] args)
//    {
//        System.out.println("Add the two number");
//        int a=4;
//        int b=5;
//        int sum=a+b;
//        System.out.println(sum);
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int a= sc.nextInt();
    System.out.println("Enter the number");
    int b= sc.nextInt();
    int sum = a+b;
    System.out.println("Addition of these two number is");
    System.out.println(sum);


}

}
