public class String_substring {
    public static String Substring(String str , int si, int ei){
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr = substr + str.charAt(i);

        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "ShivamSingh";
        String a=Substring(str,0,5);
        System.out.println(a);

        // there is a inbuild method also which make a substring;
        System.out.println(str.substring(1,5));

    }
}
