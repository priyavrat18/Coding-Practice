import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;






public class Test
{
   
    public static void main(String[] args) throws IOException
    
    {
    	FileReader sourcestream=null;
    	
    	try {
    		sourcestream= new FileReader("resume.txt");
    		int temp;
    		while((temp=sourcestream.read())!=-1)
    			System.out.println((char)temp);
    	}
    	finally {
    		if(sourcestream !=null)
    			sourcestream.close();
    	}
    	
    	 
    
    }
}