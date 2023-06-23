
//5.Write a Java program to find the minimum value in an array of integers.
public class array_05 {
    public static void main(String[] args) {
        int arr [] = {15,56,89,87,878,52,54,56,56,48,85,10};

        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println("Minimum value in this array is "+ min );
    }
}
