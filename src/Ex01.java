public class Ex01 {

    public static void main(String[] args) {
        System.out.println("Aufgabe A:");
        a();
        System.out.println("Aufgabe B:");
        b();
        System.out.println("Aufgabe C:");
        c();
    }

    public static void a() {
        int[][] array = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.print(array[i][i1] + "\t");
            }
            System.out.println();
        }
    }

    public static void b() {
        char[][] array = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'}
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
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.print(array[i][i1] + "\t");
            }
            System.out.println();
        }
    }

}
