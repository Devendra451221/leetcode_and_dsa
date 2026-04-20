import java.io.File;

public class FileHandle5 {
    public static void main(String[] args) {
         File f=new File("C:\\Users\\dell\\Desktop\\FileHandle1.txt");
          File r=new File("C:\\Users\\dell\\Desktop\\filehandle1.txt");
          if(f.exists()){
            System.out.println(f.renameTo(r));
          }else{
            System.out.println("File does not exists");
          }
    }
}
