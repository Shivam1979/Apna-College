public class String_Palindrome1 {

public  static boolean ifPalindrome(String str){
    for (int i = 0; i < str.length()/2; i++) {
        int n = str.length();
        if (str.charAt(i)!=str.charAt(n-1-i)){
            return false;
        }
       // return true;
    }


    return true;
}
    public static void main(String[] args) {
        String str = "shiihs";
      boolean i =  ifPalindrome(str);
        System.out.println(i);
    }
}
