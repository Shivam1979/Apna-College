public class April_loop13 {
    public static void main(String[] args) {
        int arr [] = {12,23,456,45,847,78,45,46};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);
    }
}
