public class Ex05 {

    public static void main(String[] args) {
        int[][] tabelle = {
                {1001, 5, 500, 0},
                {2001, 23, 1200, 0},
                {3001, 2, 85, 0}
        };

        for (int i = 0; i < tabelle.length; i++) {
            int[] ints = tabelle[i];

            int number = ints[0];
            int amount = ints[1];
            int price = ints[2];
            int sum = ints[3];

            System.out.println(amount + "x Artikel Nr. " + number + " á " + price + " EUR = " + sum);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // BERECHNUNG

        for (int i = 0; i < tabelle.length; i++) {
            int[] ints = tabelle[i];

            ints[3] = ints[1] * ints[2];
        }

        // ERNEUTE AUSGABE

        for (int i = 0; i < tabelle.length; i++) {
            int[] ints = tabelle[i];

            int number = ints[0];
            int amount = ints[1];
            int price = ints[2];
            int sum = ints[3];

            System.out.println(amount + "x Artikel Nr. " + number + " á " + price + " EUR = " + sum);
        }
    }

}
