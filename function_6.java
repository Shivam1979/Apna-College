public class function_6 {
    public static  void factorial(int n){
        // for optimizing we rrt2 * root2;
        for (int i = 0; i <= Math.sqrt(n); i++) {

            if (n%i == 1){
                System.out.println( n+"  Number is  prime");
                break;
            }
            else {
                System.out.println(n+"  Number is not  prime");
                break;
            }
        }
//        for (int i = 2; i <= n-1; i++) {
//            if (n%i==1){
//                System.out.println( n+"  Number is  prime");
//                break;
//            }
//            else {
//                System.out.println(n+"  Number is not  prime");
//                break;
//            }
       // }
    }
    public static void main(String[] args) {
     factorial(5);



    }
}
