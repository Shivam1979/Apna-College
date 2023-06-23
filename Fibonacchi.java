public class Fibonacchi {









    public static void main(String[] args) {
        int n = 10;
        fibb(n);
    }





    public static  void fibb(int n){
      int  t1 = 0, t2 = 1;
        System.out.print("Fibonacci Series of "+n+" numbers: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

    }

    }

