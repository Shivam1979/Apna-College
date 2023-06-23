//6.  Write a Java program to check if an element is present in an array of integers.

import java.util.Scanner;

public class array_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Enter the element to check: ");
        int elem = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(elem + " is present in the array.");
        } else {
            System.out.println(elem + " is not present in the array.");
        }
    }
}

