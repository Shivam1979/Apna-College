public class Array_1 {
    public static  int Linear_search(int [] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int key=25;
        int []  arr = {12,23,25,23,56};
       int ans =  Linear_search(arr,key);
        System.out.println(ans);
    }
}
