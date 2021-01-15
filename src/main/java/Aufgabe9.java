import javax.swing.*;

public class Aufgabe9 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Wie lautet dein Name");
        double gewicht = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte gib dein Gewicht ein"));
        double groesse = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte gib deine Grösse an"));
        double bmi= gewicht / Math.pow(groesse, 2);
        System.out.println(name + " dein BMI ist: " + bmi);

    }
}
