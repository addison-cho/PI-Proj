
// manages interactions with the user
import java.net.SocketPermission;
import java.util.Scanner;

public class User {
    static Scanner scan = new Scanner(System.in);

    public static void main (String[] args) {
        int ans = 0;
    
        while (!(ans == 6)) {
            ans = 0;
            menu();
            System.out.println("Enter your choice: ");
            ans = scan.nextInt();
            System.out.println("\n");

            if (ans == 1) {

            }
            else if (ans == 2) {

            }
            else if (ans == 3) {

            }
            else if (ans == 4) {

            }
            else if (ans == 5) {

            }
            else if (ans == 6) {
                System.out.println("Thanks for using our scuffed program. Have a good day!\n");
            }
            else {
                System.out.println("Invalid input, please try again.\n");
            }
        }
    }

    public static void menu() {
        System.out.println("""
        -------------------------------
        |                             |
        |  1) View existing curves    |
        |  2) Edit existing curves    |
        |  3) Add curve               |
        |  4) Remove curve            |
        |  5) Display                 |
        |  6) Exit                    |
        |                             |
        -------------------------------
        """);
    }
} 