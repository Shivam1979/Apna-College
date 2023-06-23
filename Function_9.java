import java.util.Scanner;

public class Function_9 {
    public  static  boolean isEven(int n){
        if (n%2==0){
            return true;
        }else {
            return false ;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isEven(n);
        System.out.println(ans);
    }
}
