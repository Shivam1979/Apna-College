public class print {
    public static void main(String[] args) {

       int i = 0;
        int j = 0;

        for (int k = 0; k < 8; k++) {
            if (++i > 4 || ++j > 4) {
                i++;
            }
        }

       // System.out.println(j + " " + i);



            Integer i1 = 125;
            Integer i2 = 125;
            System.out.println(i1 == i2);

            Integer i3 = 128;
            Integer i4 = 128;
            System.out.println(i3 == i4);


    }
}
