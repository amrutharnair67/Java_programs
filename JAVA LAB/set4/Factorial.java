import java.util.Scanner;
class Factorial
{
    int fact(int n)
    {
        if( n >= 1)
        {
            return n*fact(n-1);
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Factorial obj=new Factorial();
        int n;
        System.out.println("Enter a number");
        n=in.nextInt();
        System.out.println("The factorial of "+n+" is "+obj.fact(n));
    }
}