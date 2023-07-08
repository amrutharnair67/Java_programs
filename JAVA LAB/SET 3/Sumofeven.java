import java.util.Scanner;
class Sumofeven
{
    int n,s;
    Sumofeven()
    {
        n=0;
        s=0;
    }
    void sum()
    {
        Scanner obj9=new Scanner(System.in);
        System.out.println("The limit");
        n=obj9.nextInt();
        for(int i=2;i<=n;i=i+2)
        {
            s=s+i;
        }
        System.out.println("The sum of "+n+" is ="+s);
    }
    public static void main(String[] args)
    {
        Sumofeven obj=new Sumofeven();
        obj.sum();
    }
}