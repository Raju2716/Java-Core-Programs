public class Wrapper {
    public static void main(String[] args) {

        // int i = 100;
        // Integer iobj = Integer.valueOf(i);
        // Integer iobj1 = i; // Autoboxing
        // System.out.println(iobj + iobj1);

        Integer iobj1 = new Integer(100);
        int i = iobj1.intValue();
        int j = iobj1;
        System.out.println(i + j);

    }
}
