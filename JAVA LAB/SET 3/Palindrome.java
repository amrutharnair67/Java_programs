import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner obj6=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=obj6.nextInt();
        int temp=0;
        temp=n;
        int rev=0;
        int mod=0;
        while( temp > 0 )
        {
            mod=temp%10;
            rev=(rev*10)+mod;
            temp=temp/10;
        }
       // System.out.println("The reverse is "+rev);
        if(rev==n)
        {
            System.out.println("The number is Palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
    }
}