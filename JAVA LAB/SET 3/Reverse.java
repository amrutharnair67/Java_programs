import java.util.Scanner;
class Reverse 
{
    void Rev(int n)
    {
        int temp,d,reve;
        temp=n;
        reve=0;
        while(temp !=0)
        {
            d=temp%10;
            reve=(reve*10)+d;
            temp=temp/10;
        }
        System.out.println("The reverse of "+n+" is="+reve);
    }
    public static void main(String[] args)
    {
        Reverse obj=new Reverse();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        obj.Rev(n);
    }
}