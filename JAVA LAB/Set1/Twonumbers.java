import java.util.Scanner;
class Twonumbers
{
    public static void main(String[] args)
    {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=obj1.nextInt();
        int b=obj1.nextInt();
        int c=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+c);
    }
}