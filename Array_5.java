public class Array_5 {

    public static  void Print_pair(int numbers[]){
        int count = 0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("("+numbers[i]+","+numbers[j] + ")");
count ++;
            }
            System.out.println();
        }
        System.out.println("Total number of pair is " + count) ;
    }

    public static void main(String[] args) {
        int numbers [] = {5,6,7,8,6};
       Print_pair(numbers);

    }
}
