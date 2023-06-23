
//Find the largest element in an array: Given an array of integers, write a program to find the largest element in the array
public class Largest_In_Array {
    public static void main(String[] args) {
        int arr[] = {23,43,56,76,23,45};

        Large ob = new Large();
        ob.large(arr);


    }
}




class  Large extends Larger{

}

class Larger{
    void large(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
