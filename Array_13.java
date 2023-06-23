public class Array_13 {


     public static  void PivotIndex(int [] nums){
         int length = nums.length-1;
         for (int i = length; i >=0; i--) System.out.print(nums[i] + "    ");

     }


    public static void main(String[] args) {
    int nums []  = {4,5,6,7,0,1,2};
    PivotIndex(nums);
        for (int i = 0; i < 9; i++)
            System.out.println("hi");
    }
}
