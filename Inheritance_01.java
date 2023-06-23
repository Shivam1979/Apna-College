//Inheritance
//inheritance is when properties & methods of base class are passed on to a derived class

public class Inheritance_01 {
    public static void main(String[] args) {

Elephant e = new Elephant();
e.bark();
e.eat();
    }
}

//Base class
class  Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void run(){
        System.out.println("run");
    }
}

// Derived class
class  Elephant extends Animal  {
    int legs;
    void bark(){
        System.out.println("Barks ");
    }
}

