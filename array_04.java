// 4.  Write a Java program to find the maximum value in an array of integers
public class array_04 {
    public static void main(String[] args) {
        int arr [] = {34,45,43,56,76,87,98,654,34,23,887};
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]> max){
                max = arr[i];
            }

        }
        System.out.println("Maximum value in array is " + max);
    }
}
