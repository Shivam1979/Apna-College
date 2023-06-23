//3. Write a Java program to reverse a given string.
public class Que10Apr_3 {
    public static void main(String[] args) {
        String str =  "Ayushi";
        String rev = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
