
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

			public class TestingOnFile {

			public static void main(String[] args) throws IOException {

				Scanner input=new Scanner(System.in);
				char in=input.next().charAt(0);
				String word=input.next();
				int c=0;
				int n=1;
				int words=0;
				int sum=0;
				int chars=0;
				int w=0;
				int charWithoutSpace=0;
				BufferedReader r;
				try {
					r=new BufferedReader(new FileReader("d:\\lines.txt"));
					String l;
					l = r.readLine();

				while(l!=null)
					{
					c++;

					for(int i=0;i<l.length();i++)
					{
						charWithoutSpace++;
					}





					String[] a= l.split(" ");
					for(int i=0;i<a.length;i++)
					{
						if(a[i].equalsIgnoreCase(word))
						{
							w++;	
						}

						words++;
						System.out.print(a[i]);
						for(int j=0;j<a[i].length();j++)
						{
							if(a[i].charAt(j)==in)
							{
								sum++;

							}
							chars++;
						}

					}
//System.out.println(l);
l = r.readLine();
}
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


System.out.println("Line of this file are "+c);
System.out.println("Words of this file are "+words);
System.out.println("charecters in this file are "+chars);
System.out.println("charecters with spaces in this file are "+charWithoutSpace);
System.out.println("charecter "+in + " in this file is "+sum +" times");
System.out.println("Word "+word + " in this file is "+ w +" times");

}

}


