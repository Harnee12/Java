import java.io.File;//package for file handling
import java.io.IOException;//package for exception 
public class Filecreation//class creation
{
	public static void main(String[] args)//main method 
	{
		File file=new File("C:\\Users\\lenovo\\Desktop\\abc.txt");//creating file in specified location
		boolean present=file.exists();//checking whether the file created or not
		if(present==false)
		{
			try{
				boolean created=file.createNewFile();
				System.out.println("file created"+created);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}