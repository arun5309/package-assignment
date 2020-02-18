import mypackage.Helper; // Importing an user defined class from an user created package
import java.util.Scanner; // Importing predefined class from a predefined package

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("What is your name?");
        Helper helper = new Helper(cin.nextLine());
        helper.sayHello();
    }
}
