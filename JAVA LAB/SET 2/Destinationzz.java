import java.util.Scanner;
import java.io.*;
class Destination implements Serializable
{
    static String dest;
    static int ticket;
}
class Destinationzz
{
    public static void main(String[] args)throws IOException,ClassNotFoundException
    {
        Scanner sc=new Scanner(System.in);
        Destination d1=new Destination();
        System.out.println("Enter the name of the Destination");
        d1.dest=sc.next();
        System.out.println("Enter ticket fare:");
        d1.ticket=in.nextInt();
        FileOutputStream foss=new FileOutputStream("destination.txt",true);
        ObjectOutputStream ooss=new ObjectOutputStream(foss);
        ooss.writeObject(d1);
        ooss.close();
        in.close();
        FileInputStream fiss=new FileInputStream("destination.txt");
        ObjectInputStream oiss=new ObjectInputStream(fiss);
        Destination d=(Destination)oiss.readObject();
        System.out.println("The name of the Destination is "+d.dest);
        System.out.println("Ticket fare  is "+d.ticket);
        oiss.close();
        fiss.close();
    }
}