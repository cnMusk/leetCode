/**
 * Created by liudan on 2020/3/11.
 */
public class Solution5 {


    public boolean canThreePartsEqualSum(int[] A) {


        int ave = 0;

        for (int i=0;i<A.length;i++) {
            ave += A[i];
        }

        if (ave % 3 !=0)  return false;

        int ave2 = ave / 3;

        int count =0;

        int tmp =0;

        for (int j=0;j<A.length;j++) {
            tmp += A[j];
            if (tmp == ave2) {
                count++;
                tmp =0;
            }

        }

        if (count == 3) {
            return true;
        }else {
            return false;
        }

    }
}
