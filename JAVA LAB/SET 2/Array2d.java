import java.util.Scanner;
class Array2d
{
    public static void main(String[] args)
    {
        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter the row");
        int row=obj2.nextInt();
        System.out.println("Enter the column");
        int column=obj2.nextInt();
        int arr[][]=new int[row][column];
        System.out.println("Enter "+row+"*"+column+"metrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=obj2.nextInt();
            }
        }
        System.out.println("The value in the array are");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int i,j,sumofrow,sumofcol,k,m,h;
        k=1;
        for(i=0;i<row;i++)
        {
            sumofrow=0;
            for(j=0;j<column;j++)
            {
                sumofrow=sumofrow+arr[i][j];
            }
            System.out.println("The sum of "+k+" row is "+sumofrow);
            k++;
        }
        m=1;
        for(i=0;i<row;i++)
        {
            sumofcol=0;
            for(j=0;j<column;j++)
            {
                sumofcol=sumofcol+arr[j][i];
            }
            System.out.println("The sum  of "+m+" column is "+sumofcol);
            m++;
        }
    }
}
