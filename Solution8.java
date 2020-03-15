/**
 * Created by liudan on 2020/3/14.
 */
public class Solution8 {


    public static int lengthOfLIS(int[] nums) {

        int maxNum =1;

        int[] array = new int[nums.length];
        array[0]=1;
        for (int i=1;i<nums.length;i++) {
            array[i] =1;
            for (int j=i-1;j>=0;j--) {


                if (nums[i]>nums[j]) {
                    array[i] = Math.max(array[i],array[j] +1);
                }


            }
            if (array[i] > maxNum){
                maxNum = array[i];
            }

        }

        return maxNum;
    }


    public static void main(String[] args) {
        int[] array = {10,9,2,5,3,4};

        System.out.println(lengthOfLIS(array));

    }



}
