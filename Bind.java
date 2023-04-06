class right extends Bind {
    void left() {
        System.out.println("Left method is working");
    }

    public static void main(String[] args) {
        Bind b = new Bind();
        b.right();
    }
}

public class Bind {
    void right() {
        System.out.println("Right method is working");
    }
}