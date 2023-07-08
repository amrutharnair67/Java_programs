import java.util.Scanner;
class Series2
{
    static int factorial(float number)
    {
        int fact=1;
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner obj9=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=obj9.nextInt();
        float sum=0;
        for(float i=1;i<=n;i++)
        {
            sum=sum+i/factorial(i);
        }   
        System.out.println("The sum of series is "+sum);
    }
}