public class function_4 {
    //  Find the Factorial of  any number ;
    public static  int factorial(int n){
int f = 1;
        for (int i = 1; i <= n ; i++) {
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int fact = factorial(20);
        System.out.println(fact);
    }
}
