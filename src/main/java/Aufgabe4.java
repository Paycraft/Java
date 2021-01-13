public class Aufgabe4 {
    public static void main(String[] args) {
        int reihe = 1;
        int test = 1;
        int multiplizieren = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(reihe + "-er Reihe: ");
            multiplizieren = 1;
            for (int x = 0; x < 10; x++) {
                System.out.print(test * multiplizieren + " ");
                multiplizieren = multiplizieren + 1;
            }
            System.out.println();
            reihe = reihe + 1;
            test = test + 1;
        }
    }
}
