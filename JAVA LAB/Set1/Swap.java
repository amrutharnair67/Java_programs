import java.util.Scanner;
class Swap
{
    public static void main(String[] args)
    {
        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter the value for a");
        int a=obj2.nextInt();
        System.out.println("Enter the value for b");
        int b=obj2.nextInt();
        System.out.println("a="+a+" and b="+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("a="+a+" and b="+b);
    }
}