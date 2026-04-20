import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle4 {
    public static void main(String[] args) {
         
         try{
            FileReader f=new FileReader("C:\\Users\\dell\\Desktop\\FileHandle1.txt");
            try{
            int i;
            do{
                i=f.read();
                System.out.print((char)i);
            }while(i!=-1);
            
        }finally{
            f.close();
         }
         }catch(IOException e){
             e.printStackTrace();
             System.out.println(e);
         }
         System.out.println("Successfully Read data from file");
    }
    }

