import java.util.HashMap;
import java.util.Map;

/**
 * Created by liudan on 2020/3/13.
 */
public class Solution7 {

    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        int target = 0;

        for (Integer ele : nums) {

            if(map.containsKey(ele)) {
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
            if (map.get(ele) > nums.length/2) {
                target = ele;
                break;
            }

        }

        return target;

    }
}
