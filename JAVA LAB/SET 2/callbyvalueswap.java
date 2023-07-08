import java.util.Scanner;
class number
{
    void test(float a,float b)
    {
	    float c=a;
	    a=b;
    	b=c;
		System.out.println("after swaping :: a:"+a+" b:"+b);
	}
}
class callbyvalueswap
{
	public static void main(String args[])
    {
		number n=new number();
		float a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no:");
		a=in.nextFloat();
		b=in.nextFloat();
		System.out.println("before fn call :: a:"+a+" b:"+b);
		n.test(a,b);
	}
}