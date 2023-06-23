public class LOOP_1 {
    public  void Even(int n ){
        if (n%2==0){
            System.out.println("number is even ");
        }else {
            System.out.println("number is odd");
        }
    }

    public static void main(String[] args) {
        LOOP_1 l = new LOOP_1();
        l.Even(45);
    }
}
