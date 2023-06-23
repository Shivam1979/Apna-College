//5.Write a program to print the sum of the digits of a given number using a do-while loop of range 200 to 250
public class April_loop10 {
    public static void main(String[] args) {
        int i = 200;
        int sum =0;
        do {
            sum = sum + i;
            i++;
        }while (i<=250);
        System.out.println(" Sum of the number is :- "+sum);
    }
}
