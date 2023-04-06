import java.io.*;
import java.io.ObjectOutputStream;
import java.lang.Exception;

public class Persist extends Exception {
    public static void main(String[] args) {

        try {
            // creating an object for student class
            Student st = new Student(10, "Raju");
            FileOutputStream Fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(Fout);
            out.writeObject(st);
            out.flush();
            // closing the stream
            out.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
