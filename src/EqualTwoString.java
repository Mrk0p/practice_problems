import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class EqualTwoString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = "Hello";
        String b = "Hi";
        System.out.println("Enter the String value");
        String c = scanner.next();

        System.out.println("comparing a and b , result is " + a.equals(b));
        System.out.println("comparing a and c , result is " + a.equals(c));
        System.out.println("comparing b and c , result is " + c.equals(b));
    }
}
