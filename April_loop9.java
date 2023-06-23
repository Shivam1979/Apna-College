//4.Write a program to find the sum of all the odd numbers between 1 and 100 using a while loop
public class April_loop9 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            if (i%2!=0){
                sum = sum +i;
            }

        }
        System.out.println(sum);
    }
}
