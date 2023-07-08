import java.util.Scanner;
class Recursion1
{
    int oneton(int x,int i)
    {
        if(i <= x)
        {
            System.out.print(i+" ");
            return(oneton(x,++i));
        }
        return 1;
    }
    void ntoone(int n)
    {
        if (n == 0) return;
        System.out.print(n + " ");
        ntoone(n - 1);
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Recursion1 obj=new Recursion1();
        System.out.println("Enter the number");
        int n=in.nextInt();
        obj.oneton(n,1);
        System.out.println();
        obj.ntoone(n);
    }
}