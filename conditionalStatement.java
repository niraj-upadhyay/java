import java.util.Scanner;
public class conditionalStatement {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>18)
        {
            System.out.println("Allow for vote");
        }
        else
        {
            System.out.println("Not Allow for vote");
        }



    }

}
