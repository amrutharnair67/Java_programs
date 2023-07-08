import java.util.Scanner;
class Series1
{
    public static void main(String[] args)
    {
        Scanner obj8=new Scanner(System.in);
        System.out.println("Enter n");
        int n=obj8.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum=sum+j;
            }
        }
        System.out.println("The sum of the Series is "+sum);
    }
}
