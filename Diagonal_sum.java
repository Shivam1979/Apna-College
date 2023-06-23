public class Diagonal_sum {

    public static void Diagonal_sum(int matrix[][]) {
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            count = matrix[i][i] + count;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                // count1 = count1+;
                if ((i + j == 3)) {
                    count1 = count1 + matrix[j][i];
                }
            }

        }

        System.out.println(count1+count);
    }


    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        Diagonal_sum(matrix);
    }
}
