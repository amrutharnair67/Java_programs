import java.util.Scanner;
class Circle
{
    double r,pi;
    Circle()
    {
        r=5;
        pi=3.14;
    }
    void area_circle()
    {
        double area=0;
        area=pi*r*r;
        System.out.println("The area of circle of radius "+r+" is:"+area);
    }
    public static void main(String[] args)
    {

        Circle obj=new Circle();
        obj.area_circle();
    }
}