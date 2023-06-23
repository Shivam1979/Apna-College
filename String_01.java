public class String_01 {


    public static void Print(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
//        char arr[] = {'a','b','c'};
//        String str = "abcd";
//        //String are immutable in java .. we can not edit or change it
//        String str1 = new String("xyz");
//        System.out.println(arr);
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println();


     String str1 = "shivam";
//        String str2 = "singh";
        Print(str1);
//     String str = str1 + " " + str2;
//        System.out.println(str);
    }
}
