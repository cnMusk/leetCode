/**
 * Created by liudan on 2020/3/9.
 */
public class Solution3 {

    public int maxProfit(int[] prices) {
        int max =0;

        for (int i=0;i<prices.length;i++) {


            for (int j=i+1;j<prices.length;j++) {

                int temp = prices[j]-prices[i];
                if (temp > max) {
                    max = temp;
                }

            }


        }

        if (max >0) {
            return max;
        }else {
            return 0;
        }

    }
}
