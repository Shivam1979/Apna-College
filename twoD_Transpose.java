public class twoD_Transpose {

    //que -3; write a transpose of matrix

public static void Transpose(int arr[][]){
    for (int i = 0; i <= arr.length ; i++) {
        for (int j = 0; j < arr[0].length-1 ; j++) {
            System.out.print(arr[j][i]+ " ");
        }
        System.out.println();

    }
}
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {5, 6, 7},
        };
        Transpose(matrix);
    }
}
