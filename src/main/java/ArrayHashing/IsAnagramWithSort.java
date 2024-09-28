package ArrayHashing;

import java.util.Arrays;

public class IsAnagramWithSort {
    public boolean isAnagram(String s, String t) {
        char[] sArr , tArr;
        if(s.length() == t.length()) {
            sArr = s.toCharArray();
            tArr = t.toCharArray();
            Arrays.sort(sArr);
            Arrays.sort(tArr);
            for (int i = 0; i<sArr.length;i++) {
                if(sArr[i] == tArr[i])
                    continue;
                else
                    return false;
            }
        }
        else
            return false;
        return true;
    }
}
