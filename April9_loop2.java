
//2.Write a do-while loop that prints the multiples of 5 up to 25

public class April9_loop2 {
    public static void main(String[] args) {
        int i =5;
        do {
            if (i%5==0){
                System.out.println(i);
            }
            i++;
        }while (i<=25);
    }
}
