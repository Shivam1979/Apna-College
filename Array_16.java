import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class Array_16 {
    // question : - 05


  public static   List <List <Integer>> threeSum(int nums[]){
        List <List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                for (int k = j+1; k < nums.length ; k++) {
                    if (nums[i] + nums[j] + nums[k]==0){
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                       // Collection.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }
    public static void main(String[] args) {
     int nums[] = {1,2,3,4,5,6,7,8,9};

//     threeSum(nums);
        System.out.println(threeSum(nums));
    // threeSum
    }
}
