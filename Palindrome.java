// Palindrome: Write a program to check if a given string is a palindrome or not.
// A palindrome is a string that is the same when read forward or backward.

public class Palindrome {


    public static void main(String[] args) {
        Palindrome ob = new Palindrome();
        // Space removed " "
        String str = "never odd or even";
        check(str);



    }
    public static void printString(String s, String rev) {

        if (s.equals(rev)) {
            System.out.println(s + "is palindrome");
        } else System.out.println( s + " is not palindrome");

    }

    public static void check( String str){
        String rev = "";
         String s = str.replace(" ","");
        int length = s.length() - 1;
        for (int i = length; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        printString(s,rev);
    }




}
