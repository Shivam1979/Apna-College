

// 5. Write a Java program to find the index of a given character in a string(take any character)


public class Que10_5 {
    public static void main(String[] args) {
String str = "shivam";
char check = 'a';
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)==check) {
                System.out.println("Index of given character is "+i);
            }


        }

    }
}
