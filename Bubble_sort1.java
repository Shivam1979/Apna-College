public class Bubble_sort1 {



    public  static void Bubble_Descending(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] < arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;

                }

            }

        }
    }
public static void Print(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");

    }
    System.out.println();
}


    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        Bubble_Descending(arr);
        Print(arr);

    }



}
