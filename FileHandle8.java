import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileHandle8 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
  InputStream is=new FileInputStream("C:\\Users\\dell\\Desktop\\FileHandle2.txt");
  OutputStream os=new FileOutputStream("C:\\Users\\dell\\Desktop\\File1.txt");
  BufferedOutputStream bos=new BufferedOutputStream(os);
  BufferedInputStream bis=new BufferedInputStream(is);
  bos.write(bis.readAllBytes());
  bos.flush();
  bos.close();
  bis.close();
  is.close();
  os.close();
  System.out.println("Wrote Successfully");
 }
}
