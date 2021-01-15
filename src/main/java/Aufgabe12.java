public class Aufgabe12 {
    public static void main(String[] args) {


        //a
        System.out.println();
        System.out.print("Aufgabe a: ");
        int[] zahlen = {0, 1, 2, 3, 4};
        for (int jollo : zahlen) {
            System.out.print(jollo);
        }


        //b
        System.out.println();
        System.out.print("Aufgabe b: ");
        int[] nervig = new int[101];
        for (int i = 0; i <= 100; i++) {
            nervig[i] = i;
        }
        for (int a : nervig) {
            System.out.print(nervig[a] + " ");
        }


        //c
        System.out.println();
        System.out.print("Aufgabe c: ");
        int resultat = 0;
        for (int x = 0; x <= 100; x++) {
            resultat = resultat + nervig[x];
        }
        System.out.print(resultat);


        //d
        System.out.println();
        System.out.print("Aufgabe d: ");
        for (int b = 0; b < 100; b++) {
            if (nervig[b] % 2 == 0) {
                nervig[b] = nervig[b] + 1;
                System.out.print(nervig[b] + " ");
            } else {
                nervig[b] = nervig[b] - 1;
                System.out.print(nervig[b] + " ");
            }
        }
    }
}