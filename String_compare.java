public class String_compare {
    public static void main(String[] args) {
        String s1 = "Shivam";
        String s2  = "Shivam";
        String s3 = new String( "Shivam");
        // Compare
        if (s1==s2){ //  this method are check the both the object refrence which are pointing same object
            System.out.println("Both are equal");
        }else {
            System.out.println("not equal");
        }

        if (s1.equals(s3)){ // This method check the both the value of object
            System.out.println("Both are equal");
        }else {
            System.out.println("not equal");
        }

    }
}
