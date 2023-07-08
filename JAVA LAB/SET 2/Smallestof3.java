import java.util.Scanner;
class Smallestof3  
{  
public static void main(String[] args)   
{  
int a, b, c, smallest;    
Scanner sc = new Scanner(System.in);    
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();  
smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);  
System.out.println("The smallest number is: "+smallest);  
}  
} 