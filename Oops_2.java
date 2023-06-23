class  prachi {

    void  div (int a , int b ){
        System.out.println(a+b);
    }
}

class  IUC extends  prachi {
    void  div (int a , int b ){
        System.out.println(a/b);
    }
}


public class Oops_2 {

    public static void main(String[] args) {
        prachi ab = new prachi();
        ab.div(4,2);
        ab.div(4,4);
    }
}
