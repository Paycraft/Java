import javax.swing.*;

public class Aufgabe10 {
    public static void main(String[] args) {
        double zahl1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte eine Zahl eingeben"));
        double zahl2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte eine 2. Zahl eingeben"));
        String operator = JOptionPane.showInputDialog(null, "Bitte gib ein Operator an");


        switch (operator) {
            case "+":
                double plus = zahl1 + zahl2;
                System.out.println(plus);
                break;
            case "-":
                double minus = zahl1 - zahl2;
                System.out.println(minus);
                break;
            case "*":
                double mal = zahl1 * zahl2;
                System.out.println(mal);
                break;
            case "/":
                double geteilt = zahl1 / zahl2;
                System.out.println(geteilt);
                break;
            case "%":
                double prozent = zahl2 / 100 * zahl1;
                System.out.println(prozent);
                break;
        }
    }
}
