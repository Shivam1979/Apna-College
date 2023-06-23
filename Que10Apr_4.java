//4. Write a Java program to replace a given character with
// another character in a string.
public class Que10Apr_4 {
    public static void main(String[] args) {
       String str = "Shivam";
        char oldChar = 'v';
        char newChar = 'w';

        String neww = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == oldChar) {
                neww =  neww + newChar;
            } else {
                neww = neww + str.charAt(i);
            }
        }

        System.out.println("Original wali " + str);
        System.out.println("New wali  " + neww);
    }
}
