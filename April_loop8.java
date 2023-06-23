//3.Write a program to find the sum of all the numbers divisible by 3 or 5 between 1 and 100 using a for loop.

public class April_loop8 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
           sum = sum + i;
            }

        }
        System.out.println("The sum  is :- "+sum);
    }
}
