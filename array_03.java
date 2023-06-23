public class array_03 {
    public static void main(String[] args) {
        int arr [] = { 20,23,52,56,2,54,58,56};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
                 temp += arr[i];
        }
        System.out.println(temp/arr.length-1);
    }
}











