import java.io.*;

public class fileWriter {
    public static void main(String[] args) {

        try {
            FileWriter f = new FileWriter("C:\\Users\\RAJU SHARMA\\Desktop\\LC.txt");
            try {
                f.write("Java Programming is the best lanaguage..!");
            } finally {
                f.close();
            }
            System.out.println("Succesfully Data write in File ");
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}
