import Balance.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("What your balance?");
        Account account = new Account(cin.nextDouble());
        account.Display_Balance();
    }
}