public class Aufgabe15 {
    public static void main(String[] args) {


        //a
        double[] zufallszahlen = new double[10];
        for (int i = 0; i < 10; i++) {
            zufallszahlen[i] = zufallszahlen[i] + Math.round(Math.random() * 10 + 1);
        }


        //b
        System.out.print("Aufgabe b: ");
        for (double z : zufallszahlen) {
            System.out.print(z + ", ");
        }


        //c
        System.out.println();
        System.out.println("Aufgabe c: ");
        double max = 0;
        double min = 12;
        for (int z = 0; z < 10; z++) {
            if (max < zufallszahlen[z]) {
                max = zufallszahlen[z];
            }
        }
        for (int b = 0; b < 10; b++) {
            if (min > zufallszahlen[b]) {
                min = zufallszahlen[b];
            }
        }
        System.out.println("    Die Grösste Zahl ist: " + max);
        System.out.print("    Die kleinste Zahl ist: " + min);


        //d
        System.out.println();
        System.out.print("Aufgabe d: ");
        double resultat = 0;
        for (int x = 0; x < 10; x++) {
            resultat = resultat + zufallszahlen[x];
        }
        System.out.print(resultat);


        //e
        System.out.println();
        System.out.print("Aufgabe e: ");
        double resultat2 = 0;
        for (int x = 0; x < 10; x++) {
            resultat2 = resultat2 + zufallszahlen[x];

        }
        double durchschnitt = resultat2 / 10;
        System.out.print(durchschnitt);


        //f
        System.out.println();
        System.out.print("Aufgabe f: ");
    }
}
