import java.util.HashSet;

public class Array_12 {

// Distinct number checker , means if number is more than 1 it return true Otherwise return False;
 // Brute force O(n)
    public static boolean ContainDuplicate(int [] nums){
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            if (set.contains(nums[i])){
                return true;
            }else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {5,5,6,9,86,45,1,33,58,5,6,5};
 boolean ans = ContainDuplicate(nums);
        System.out.println(ans);

    }
}
