import java.io.File;

public class FileHandle2 {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\dell\\Desktop\\FileHandle1.txt");
        if(f.exists()){
            System.out.println(" File name : "+f.getName());
            System.out.println(" Absolute Path : "+f.getAbsolutePath());
            System.out.println(" Can Write : "+f.canWrite());
            System.out.println(" Can Read : "+f.canRead());
            System.out.println(" File Length : "+f.length());
            System.out.println(" File Delete : "+f.delete());
        }else{
              System.out.println("File does not exists");
        }
    }
}
