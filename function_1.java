import java.util.Scanner;

 class function_1 {
    public static int calculateSum(int a , int b){

        int sum = a+b;
        return sum;
        //System.out.println("Sum is :"+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum =  calculateSum(a,b);

    }


}
