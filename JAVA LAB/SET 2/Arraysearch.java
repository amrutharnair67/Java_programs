import java.util.Scanner;
class Arraysearch
{
    public static void main(String[] args)
    {
        Scanner obj3=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int a=obj3.nextInt();
        int ar[]=new int[a];
        System.out.println("Enter "+a+" elements");
        for(int i=0;i<a;i++)
        {
            ar[i]=obj3.nextInt();
        }
        System.out.println("Enter the element to search");
        int s=obj3.nextInt();
        for(int i=0;i<a;i++)
        {
            if(ar[i]==s)
            {
                System.out.println("Element found in "+ar[i]);
                break;
            }
            else
            {
                System.out.println("Element not found");
            }
        }
    }
}