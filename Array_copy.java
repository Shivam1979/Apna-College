
//Write a Java program to copy elements from one array to another
public class Array_copy {


    public static void main(String[] args) {
        int arr[] = {34,56,76,34,23,23,354};
        copy(arr);
    }










    public static void copy(int arr[]  ){

        int arr1[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            arr1[i]  = arr[i];

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");

        }
    }


}
