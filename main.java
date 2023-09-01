// manages interactions with the user
import java.util.Scanner;

public class main {

    public static void main (String[] args) {
        scan = new Scanner(System.in);
        String input = "";

        menu();


    }

    private void menu() {
        System.out.println("""
        a) Add
        b) Edit existing curves
        c) Delete 
        d) Display graph 
        e) Exit
        """)
    }
}