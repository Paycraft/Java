public class Aufgabe14 {
    public static void main(String[] args) {
        String stern = "";
        String stern2 = "";
        String leer = " ";
        int reihe = 4;
        for (int i = 5; i > 0; i--) {
            for (int b = reihe; b > 0; b--) {
                System.out.print(leer);
            }
            for (int x = 0; x < 1; x++) {
                stern = stern + "*";
                System.out.print(stern);
                System.out.println(stern2);
                stern2 = stern2 + "*";
            }
            reihe = reihe - 1;
        }
    }
}