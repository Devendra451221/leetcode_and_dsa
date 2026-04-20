import java.io.*;
public class FileHandle1 {
    // Create FILE
    public static void main(String[] args) {
        File f=new File("C:\\Users\\dell\\Desktop\\FileHandle1.txt");
        
        try {
            if(f.createNewFile()){
                System.out.println("File Created Successfully");
            }
            else{
                System.out.println("File Already Exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
