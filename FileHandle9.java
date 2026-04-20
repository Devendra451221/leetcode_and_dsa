import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileHandle9 {
    public static void main(String[] args) throws IOException,FileNotFoundException {
         Reader r=new FileReader("C:\\Users\\dell\\Desktop\\FileHandle2.txt");
 Writer w=new FileWriter("C:\\Users\\dell\\Desktop\\File2.txt");
 BufferedReader br=new BufferedReader(r);
 BufferedWriter bw=new BufferedWriter(w);
 char c[]=new char[100];
 br.read(c);
 bw.write(c);
 bw.flush();
 bw.close();
 br.close();
 System.out.println("Wrote");
    }
}
