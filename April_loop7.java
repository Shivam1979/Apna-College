import java.util.Scanner;

// 2.Write a program to find the factorial of a given number using a for loop.
public class April_loop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which  do you want to find \n factorial");
        int n = sc.nextInt();

        int product = 1;
        for (int i = n; i >=1 ; i--) {
            product = product *i;
        }
        System.out.println(product);
    }
}
