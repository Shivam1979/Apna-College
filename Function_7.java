
public class Function_7 {
    public static  int  change(int n){
//2! = 2 * 1 ;
        int factorial = 1;
        for (int i = 1; i >= 1 ; i--) {
         factorial = n * change(n-1);
        }
        return factorial;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
  int ans =   change(4);
        System.out.println(ans);



    }
}
 //prachi -- 20
//tanu--20
//iuc--10
// shivam -- ko
