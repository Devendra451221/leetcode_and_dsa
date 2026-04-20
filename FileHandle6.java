import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandle6 {
    public static void main(String[] args) {
        try{
         FileInputStream fread=new FileInputStream("C:\\Users\\dell\\Desktop\\filehandle1.txt");
         FileOutputStream fwrite=new FileOutputStream("C:\\Users\\dell\\Desktop\\FileHandle2.txt");
         
         try{
            int i;
            while ((i=fread.read())!=-1) {
                fwrite.write((char)i);
            }
         }finally{
            fread.close();
            fwrite.close();
         }
         System.out.println("File data copied Successfully....!");
        }catch(IOException e){
           
            System.out.println(e);
        }
        }
}
