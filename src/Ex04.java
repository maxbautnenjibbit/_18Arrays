public class Ex04 {

    public static void main(String[] args) {
        int[][] a = {
                {4, 0, 2, 44},
                {3, 20, 33, -4},
                {12, -30, 6, 110}
        };

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            int sumRow = 0;

            for (int i1 = 0; i1 < a[i].length; i1++) {
                int number = a[i][i1];

                sum += number;
                sumRow += number;

                System.out.print(number + "\t\t");
            }

            System.out.println("\t | Zeilensumme: " + sumRow);
        }

        System.out.println("==============================");

        for (int i = 0; i < a[0].length; i++) {
            int gapSum = 0;

            for (int i1 = 0; i1 < a.length; i1++) {
                gapSum += a[i1][i];
            }

            System.out.print(gapSum + "\t\t");
        }

        System.out.println("\nSumme: " + sum);
    }

}
