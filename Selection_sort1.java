public class Selection_sort1 {
    public static void selection(int arr[]){
        for (int i = 0; i < arr.length ; i++) {

            int minPos = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[minPos] < arr[j]){
                    minPos = j;
                }

            }
            //Swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

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
        selection(arr);
        Print(arr);


    }
}
