import java.io.*;
import java.net.*;
class Aclient
{
    public static void main(String[] args)
    {
        try
        {
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello!!! Who is this?");
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String  str=(String)dis.readUTF();  
            System.out.println("message= "+str);
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}