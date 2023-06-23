import java.util.Scanner;

// Write a Java program to check if an element is present in an array of integers.
public class Array_07 {
    public static void main(String[] args) {

        int arr[] = {23,56,45,78,89,85,6,5,65,4654,885};
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== check){
                 found =true;
                 break;
            }

        }
        if (found){
            System.out.println( check+ " is present in the array");
        }else System.out.println("Not present ");


    }
}
