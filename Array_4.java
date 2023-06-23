public class Array_4 {
    // Reverse an array
    public static  void  reverse(int numbers[]){
        int first = 0, last = numbers.length-1;
        while (first < last){
            // Now we swap the fuction
            int swap = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = swap;
            first++;
            last--;
        }
    }


    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        reverse(numbers);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + "  A");
        }
    }
}
