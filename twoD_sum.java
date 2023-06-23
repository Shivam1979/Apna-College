public class twoD_sum {

//que-2 lecture-15..Print the second row
    public static void SumRow(int arr[][] ){
        int numRow = 1;
        int count = 0 ;

        for (int i = 0; i < arr.length ; i++) {
            count = count+ arr[numRow][i];
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 4, 9},
                {11, 4, 3},
                {2, 2, 3}};
        SumRow(matrix);
    }
}
