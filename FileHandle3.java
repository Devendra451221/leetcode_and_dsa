import java.io.FileWriter;
import java.io.IOException;

public class FileHandle3 {
public static void main(String[] args) {
   
   try{
        FileWriter f=new FileWriter("C:\\Users\\dell\\Desktop\\FileHandle1.txt");
         try{
            f.write("Jai Shree Ram .... !");
            f.write("Jai JAVA....!");
         }finally{
            f.close();
         }
         System.out.println("Successfully Wrote into file");
    }catch(IOException e){
        e.printStackTrace();
        System.out.println(e);
    }
}    
}
