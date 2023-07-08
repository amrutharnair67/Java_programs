import java.io.*;
import java.util.Scanner;
class Search implements FilenameFilter 
{	
	String name;
	public Search(String name)
	{
		this.name = name;
	}
	public boolean accept(File dir, String name1)
	{
		return name1.startsWith(name);
	}
}
 class Mainsearch{
	
	public static void main(String[] args){
      	Scanner in=new Scanner(System.in);
      	System.out.println("Enter the path");
		File directory = new File(in.nextLine());
      	System.out.println("Enter the name of file with extension");
		Search filter= new Search(in.nextLine());
		String[] flist = directory.list(filter);
		if (flist == null){
			System.out.println("Empty directory or directory does not exists.");
		}
		else {
			for (int i = 0; i < flist.length; i++){
				System.out.println(flist[i]+" found");
			}
		}
	}
}
