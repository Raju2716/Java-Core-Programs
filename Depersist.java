import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.Exception;

public class Depersist extends Exception {
    public static void main(String[] args) {

        try {
            // Creating Stream to read the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student st = (Student) in.readObject();

            // Printing the data of the serialized object
            System.out.println(st.id + "" + st.name);
            // closing the stream
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
