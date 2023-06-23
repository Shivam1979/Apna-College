

public class Oop_1 {
    // same class  , same name of method , but   diffrent arguements........


    static void add(int a , int b  ){
        System.out.println(a+b);
    }

     static void add(int a , int b  , int c){
        System.out.println(a+b +c);

    }


   static   void add(int a , int b  , int c , String s  ){
        System.out.println(s);
        System.out.println(a+b);
    }

    public  void main(String[] args) {

      add(2,4);
      add(3,5,6);
      add(4,6,5, "Prachi");
    }

}
