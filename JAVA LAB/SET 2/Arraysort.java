import java.util.Scanner;
class Arraysort
{
    public static void main(String[] args)
    {
        Scanner obj5=new Scanner(System.in);
        System.out.println("Enter the limit  of array");
        int a=obj5.nextInt();
        int ar[]=new int[a];
        System.out.println("Enter "+a+" elements");
        for(int i=0;i<a;i++)
        {
            ar[i]=obj5.nextInt();
        }
        int temp;
        System.out.println("The sort array is");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if( ar[i]>ar[j])
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(ar[i]+"\t");
        }
    }
}