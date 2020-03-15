/**
 * Created by liudan on 2020/3/8.
 */
public class Solution {


//    public int coinChange(int[] coins, int amount) {
//
//        int count = 0;
//        TreeSet<Integer> treeSet = new TreeSet<Integer>((Integer o1,Integer o2)->{
//            return o2.compareTo(o1);
//        });
//        for (Integer i : coins) {
//            treeSet.add(i);
//        }
//
//        int sum =0;
//
//        for (Integer ele : treeSet) {
//
//            while (sum < amount) {
//
//                sum = sum + ele;
//                count++;
//
//            }
//
//            if (sum != amount) {
//                sum = sum - ele;
//                count--;
//            }else {
//                break;
//            }
//        }
//
//        if (sum == amount) {
//            return count;
//        }else {
//            return -1;
//        }
//    }
public int coinChange(int[] coins, int amount) {
    if (amount < 1) return 0;

    return coinChange(coins, amount, new int[amount]);
}

    private int coinChange(int[] coins, int rem, int[] count) {

        if (rem < 0) {
            return -1;
        }

        if (rem == 0) {
            return 0;
        }

        if (count[rem-1] !=0) {
            return count[rem-1];
        }

        int min = Integer.MAX_VALUE;
        for (Integer coin : coins) {

            int res = coinChange(coins,rem - coin,count);
            if (res >=0 && res < min) {
                min = res +1;
            }

        }

        count[rem-1] = (min == Integer.MAX_VALUE) ? -1 : min;

        return count[rem -1];

    }



    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] array ={6,2,5};

        System.out.println(solution.coinChange(array,1111111));
        System.out.println();


    }
}


