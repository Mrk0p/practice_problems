public class StaticVariable {

    static int a = 12;
    static int b = 10;
    static void m() {
        System.out.println("m is static method .");
    }
    static {
        if (a > b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        m();
    }
}
