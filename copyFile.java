import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyFile {
    public static void main(String[] args) throws IOException {

        FileInputStream r = new FileInputStream("C:\\Users\\RAJU SHARMA\\Desktop\\LC.txt");
        FileOutputStream w = new FileOutputStream("C:\\Users\\RAJU SHARMA\\Desktop\\Raju.txt");

        int i;
        while ((i = r.read()) != -1) {
            w.write((char) i);
        }
        System.out.println("Data Copied successfully..!");
    }
}
