
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ob = new TwoSum();
        int[] nums ={2,7,11,15};
        int target = 9;
        for(int i = 0;i < 2; i++){
            System.out.print(ob.twoSum(nums, target)[i]);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        // TODO
        int[] indices = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i!=j){
                    indices[0] = nums[i];
                    indices[1] = nums[j];
                    Arrays.sort(indices);
                    return indices;
                }
            }
        }
        return indices;
    }
    
}
