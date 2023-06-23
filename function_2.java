public class function_2 {
    public static void swap(int a , int b){
        int swap = a;
        a=b;
        b=swap;
        System.out.println(" a = "+a);
        System.out.println("b = "+b);
    }
    public static void swap(int a ){
        a =50;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
         swap(a,b);
        System.out.println(" a = "+a);
        System.out.println("b = "+b);

    }
}
