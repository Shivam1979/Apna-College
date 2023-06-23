import java.util.Scanner;

//9. Write a Java program that prompts the user to enter a currency code (USD, EUR, JPY)
// and then displays the corresponding exchange rate in INR using a switch statement
public class Que10_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String curr ;
        switch (str){
            case "USD":
                curr = "81.99 INR of 1 USD";
                break;
            case "EUR":
                curr = "88.98 INR of 1 EUR";
            case "JPY":
                curr = "0.61 INR of 1 EUR";
            default:
                curr = "INVALID CURRENCY";
        }
        System.out.println(curr);
    }
}
