
/*public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.println(n1 + " " + n2);

        for (i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.println("" + n3);
            n1 = n2; // n1=0 -->n1=1
            n2 = n3;
        }
    }
}*/
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        int term, a = 0, b = 1, c;
        System.out.print("Enter term ");
        Scanner r = new Scanner(System.in);
        term = r.nextInt();

        for (int i = 1; i <= term; i++) {
            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }
    }
}