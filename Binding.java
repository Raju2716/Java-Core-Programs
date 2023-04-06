// program of dynamic binding
/*class left extends Binding {
    void right() {
        System.out.println("Left method is working");
    }

    public static void main(String[] args) {
        // Enter Your Code Here
        Binding b = new left();
        b.right();

    }

}

public class Binding {
    void right() {
        System.out.println("Right method is working");

    }

}*/

public class Binding { // static binding program
    void right() {
        System.out.println("Static binding example");
    }

    public static void main(String[] args) {
        Binding b = new Binding();
        b.right();
    }
}