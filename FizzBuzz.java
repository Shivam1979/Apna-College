
//FizzBuzz: This is a classic coding question where you need to write a program that prints numbers from 1 to 100.
// For multiples of three, the program should print "Fizz" instead of the number and for multiples of five,
// it should print "Buzz". For numbers which are multiples of both three and five, the program should print "FizzBuzz


public class FizzBuzz {





    public static void main(String[] args) {
        FizzBuzz ob =  new FizzBuzz();
        ob.fizzbuzz();
    }








    public  void fizzbuzz(){
        {
            for (int i = 1; i<=100; i++){
                if (i%3==0 && i%5==0) {
                    System.out.println("FizzBuzz");
                }
                else if (i%5==0){
                    System.out.println("Buzz");
                } else if (i%3==0){
                    System.out.println("Fizz");
                }else System.out.println(i);
            }
    }


}


}
