import java.util.Scanner;

public class Ex02 {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Aufgabe A:");
        a();
        System.out.println("Aufgabe B:");
        b();
        System.out.println("Aufgabe C:");
        c();

        scanner.close();
    }

    public static void a() {
        int[][] array = {
                {scanner.nextInt(), scanner.nextInt()},
                {scanner.nextInt(), scanner.nextInt()},
                {scanner.nextInt(), scanner.nextInt()}
        };

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.print(array[i][i1] + "\t");
            }
            System.out.println();
        }
    }

    public static void b() {
        String[][] array = {
                {scanner.next(), scanner.next(), scanner.next()},
                {scanner.next(), scanner.next(), scanner.next()}
        };

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.print(array[i][i1] + "\t");
            }
            System.out.println();
        }
    }

    public static void c() {
        double[][] array = {
                {scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()},
                {scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()},
                {scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()}
        };

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.print(array[i][i1] + "\t");
            }
            System.out.println();
        }
    }

}
