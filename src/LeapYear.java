import java.util.Scanner;

public class LeapYear {

    static void leapYear(int a) {
        if(a >= 1582) {
            System.out.println("Year is valid");
            if (a%400 == 0) {
                System.out.println(a +" is a leap year. ");
            } else if (a%4 == 0 && a%100 !=0) {
                System.out.println(a+ " is a leap year. ");
            }
            else {
                System.out.println(a+ " is not a leap year. ");
            }
        }
        else {
            System.out.println("Enter the valid year.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int a = scanner.nextInt();
        leapYear(a);
    }
}
