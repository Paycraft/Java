public class Aufgabe2 {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            System.out.println("Viel Glück");
        }

        int ez = 0;
        while (ez < 5) {
            System.out.println("Joel, while");
            ez++;
        }

        ez = 0;
        do {
            System.out.println("Joel, dowhile");
            ez++;
        }
        while (ez < 5);
    }
}
