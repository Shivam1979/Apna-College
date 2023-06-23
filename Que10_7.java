//7. Write a Java program to check if a given string is a palindrome.
public class Que10_7 {
    public static void main(String[] args) {
        String str ="racecar";
        String rev ="";
        int length = str.length()-1;
        for (int i = length; i >=0 ; i--) {
            rev = rev+str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)){
            System.out.println("Number is palindrome");
        }else System.out.println("String is not palindrome");

    }
}
