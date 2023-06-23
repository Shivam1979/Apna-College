//10. Write a Java program that prompts the user to enter a grade percentage (0-100)
// and then displays the corresponding letter grade using a switch statement

public class Que10_10 {
    public static void main(String[] args) {
        int per = 30;
        switch (per/10){

        case 10: case 9:
            System.out.println("A");
            break;
        case 8:
            System.out.println("B");
            break;
        case 7:
            System.out.println("C");
            break;
        case 6:
            System.out.println("D");
            break;
        case 5:
            System.out.println("E");
            break;
        case 4: case 3: case 2: case 1:
            System.out.println("Need to Improve");
            break;
        default:
            System.out.println("You entered wrong % ");

    }
    }
}
