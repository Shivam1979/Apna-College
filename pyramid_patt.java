public class pyramid_patt {
    public static void main(String[] args) {



        /*char ch = 'A';
        int n =4;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(ch);

                ch++;

            }
            System.out.println();
            
        }*/


        char ch = 'A';
        int n=7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(ch);
              ch++;

            }
            System.out.println();
        }

    }
}
