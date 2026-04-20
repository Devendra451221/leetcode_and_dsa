import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileHandle7 {
    public static void main(String[] args) {
        
    try{
     // FileReader f=new FileReader("C:\\Users\\dell\\Desktop\\FileHandle1.txt");
     //OutputStream out=new FileOutputStream("C:\\Users\\dell\\Desktop\\FileHandle1.txt");
      //BufferedInputStream bf=new BufferedInputStream(in);
      InputStream in=new FileInputStream("C:\\Users\\dell\\Desktop\\FileHandle1.txt");
      OutputStream out=new FileOutputStream("C:\\Users\\dell\\Desktop\\FileHandle2.txt");
      
    try {
      
      if(in.available()!=0){
     byte b[]=in.readAllBytes();
    out.write(b);
      }
    }finally{
       in.close();
       out.flush();
       out.close();

    } }
    catch (Exception e) {
     e.printStackTrace();
    }
    
    }
}
