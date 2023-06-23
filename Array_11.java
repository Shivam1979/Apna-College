public class Array_11 {
// Distinct number checker , means if number is more than 1 it return true Otherwise return False;
    // Brute force O (n2)


public  static  boolean  Distinct(int number[]){ // make a method retuen type boolean  and pass the  array of integer
    for (int i = 0; i < number.length-1; i++) { // run the loop from i =0 to array length -1 because we run one more loop which start from i+1 to last less than i

        for (int j = i+1; j < number.length; j++) { // we run one more loop which start from i+1 to less than the loop
            if (number[i]==number[j]){ //  here if any number is distinct it means it come more than one time , so we check for every number
                return true;
            }

        }
    }
    return false; // here return false if no distict number is found
}

    public static void main(String[] args) {
        int number[] = {1,2,5,2,1};
        boolean ans = Distinct(number); // call the method and pass the argument and store it into ans
        System.out.println(ans);

    }
}
