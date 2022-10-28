//HARNEE A
//CG2576
// Program with "FileReader" and "FileWriter" classes
import java.io.*;//file handling package
public class FileReaderWriterExample//class creation
{  
    public static void main(String[] args)throws IOException//main method with exception
	{       
            //to write the content in file using FileWriter in specific location
            FileWriter w = new FileWriter("C:\\Users\\lenovo\\Desktop\\test.txt");
            String content = "I love java";  //string content
            w.write(content); //using write method 
			//to read the content in  same file using FileReader in that same specific location
            FileReader r=new FileReader("C:\\Users\\lenovo\\Desktop\\test.txt"); 
            int i;
            while((i=r.read())!=-1)//read the content as character by character until the end
            System.out.println((char)i);
			r.close();	//close the reader
            w.close();  //close the writer
            System.out.println("Done");  //display the done message
         
    }  
}  