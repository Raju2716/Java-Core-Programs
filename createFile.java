import java.io.*;

public class createFile {
    public static void main(String args[]) { // throws IOException

        File f = new File("C:\\Users\\RAJU SHARMA\\Desktop\\LC.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File Sucessfiully Created..!");
            } else {
                System.out.println("File Already Exist..!");
            }
        } catch (IOException i) {
            System.out.println("Exception Handled..!");
        }
    }
}
