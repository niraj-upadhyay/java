import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n,a,r,sum=0;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         a=n;
         while(n>0)
         {
             r = n%10;
             sum=sum*10+r;
             n=n/10;
         }
         if(a==sum)
         {
             System.out.println("Palindrome Number");
         }
         else
         {
             System.out.println("Not palindrome number");
         }

    }
}
