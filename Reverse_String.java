public class Reverse_String {
    public static void main(String[] args) {
       Reverse ob = new Reverse();
       ob.str(" ayushi prachi tanu shivam  ");


    }

}









class Reverse{
    void str(String str ){

        String strem = "";
        int length = str.length()-1;

        for (int i = length ; i>=0 ; i-- )
        {
            strem = strem + str.charAt(i);
        }
        System.out.println(strem);
    }
}
