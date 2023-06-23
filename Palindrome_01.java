public class Palindrome_01 {
        public static void main(String[] args) {
                String  str = "a";
                String rev = "";
                for (int i = str.length()-1; i >=0 ; i--) {

                      rev = rev + str.charAt(i);




                }
                System.out.println(str + " " + rev);



                if (str.equals(rev)){
                        System.out.println( str+ " is palindrome");
                } else System.out.println( str+ " is not palindrome");

        }
}
