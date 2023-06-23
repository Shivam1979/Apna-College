public class function_5 {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    // function overloading is acheive in same class with same name of function but diffrent parameter
    public static int BinCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int bin = fact_n / (fact_r * fact_nmr);
        return bin;
    }
    public static void main(String[] args) {
   int ans =   BinCoeff(5 , 2);
        System.out.println(ans );
    }
}
