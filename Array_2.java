public class Array_2 {

    //Largest Number in Array ;
    public  static  int Largest_num(int [] number , int [] number1){


        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < number.length ; i++) {
            if (min < number[i]){
                min = number[i];

            }
            if (max > number[i]){
                max = number [i];
            }

        }
        System.out.println(max);
        return min;
    }
    public static void main(String[] args) {
        int []  number = {12, 56, 45, 56, 4, 646, 465, 64, 12, 651, 654, 54, 4, 456, 64, 64};

       int ans =  Largest_num(number,number);
        System.out.println(ans);


    }
}