import javax.swing.*;
import java.sql.SQLOutput;

public class Aufgabe6 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Gib dein Name ein");
        while (true) {
            if (name.equals("Joel")) {
                System.out.println("Das bin ich!");
                break;
            } else {
                System.out.println("Das bin ich nicht!");
                name = JOptionPane.showInputDialog(null, "Gib dein Name ein");
            }

        }

    }
}
