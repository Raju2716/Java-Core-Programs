import java.io.File;

public class fileInfo {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\RAJU SHARMA\\Desktop\\LC.txt");

        if (f.exists()) {
            System.out.println("File Name: " + f.getName());
            System.out.println("File location: " + f.getAbsolutePath());
            System.out.println("File Writeable: " + f.canWrite());
            System.out.println("file Readable: " + f.canRead());
            System.out.println("File Size: " + f.length());
            System.out.println("File Removed: " + f.delete());
        } else {
            System.out.println("File doesn't Exists");
        }
    }
}
