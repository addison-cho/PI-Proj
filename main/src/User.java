
// manages interactions with the user
import java.net.SocketPermission;
import java.util.Scanner;

public class User {
    Scanner scan = new Scanner(System.in);

    public static void main (String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("""-----------------------------
        1) View existing curves
        2) Edit existing curves
        3) Add curve
        4) Remove curve
        5) Display
        6) Exit

        -----------------------------
        """);
    }
}