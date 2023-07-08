import java.util.Scanner;
class Sumofdigits
{
    int sum(int n)
    {
        int temp,d,s;
        temp=n;
        d=0;
        s=0;
        while(temp!=0)
        {
            d=temp%10;
            s=s+d;
            temp=temp/10;
        }
        return s;
    }
    public static void main(String[] args)
    {
        int s;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        Sumofdigits obj=new Sumofdigits();
        s=obj.sum(n);
        System.out.println("The sum of "+n+ " is ="+s);
    }
}