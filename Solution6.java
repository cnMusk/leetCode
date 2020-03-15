/**
 * Created by liudan on 2020/3/12.
 */
public class Solution6 {


    public String gcdOfStrings(String str1, String str2) {

        String string1 = str1+str2;
        String string2 = str2+str1;

        if (string1.equals(string2)){
            String tmp="";

            for (int i=0;i<str2.length();i++) {

                tmp = str2.substring(0,i+1);
                if ((tmp+str2).equals(str2+tmp)) {
                    break;
                }
            }
            return tmp;
        }else {
            return "";
        }


    }
}
