import java.util.Scanner;
class Player implements Serializable
{
    String  name;
    int t2t;
    String cname;
}
class Cricket
{
    public static void main(String[] args)throws Exception
    {
        Player p1=new Player();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the player name:");
        p1.name=sc.next();
        System.out.println("Enter the no of t2t played");
        p1.t2t=sc.nextInt();
        System.out.println("Enter the name of Captain");
        p1.cname=sc.next();
        FileOutputStream fos=new FileOutputStream("telecast.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(p1);
        FileInputStream fis=new FileInputStream("telecast.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Player p=(Player)ois.readObject();
        System.out.println("The name of player is"+p.name);
        System.out.println("The no of t2t played "+p.t2t);
        System.out.println("The name of Captain is "+p.cname);
    }
}