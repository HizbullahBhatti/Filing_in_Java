import java.io.*;
import java.util.Scanner;

public class CharacterCount {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("e:\\TestingOnFile.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input);	
        
        String line;
        int characterCount = 0;
        
//        Scanner scan = new Scanner (System.in);
//        System.out.print("Enter a character");
//        char abc = scan.next().charAt(0);
//        
        while((line = reader.readLine()) != null) 
        { 
     
            if((!line.equals(""))) 
            { 
                  
                characterCount =characterCount+line.length();}
        }
        System.out.print(characterCount);

	

	}}
