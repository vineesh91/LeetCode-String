import java.util.Collections;
import java.util.Hashtable;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int max = 0;
        Hashtable<Integer,String> str = new Hashtable<>();
        if(strs.length > 0) {
            for (int i = 0; i < strs[0].length(); i++) {
                sb.append(strs[0].charAt(i));
                str.put(i,sb.toString());
                max++;
            }
        }
        for (String s: strs) {
            for (int key = 0; key < str.size(); key++) {
                int size = str.get(key).length();
                if (size > s.length()) {
                    if (key < max) {
                        max = key;
                    }

                    break;
                }
                else {
                    if (!str.get(key).equals(s.substring(0,size))){
                        if (key < max) {
                            max = key;
                        }
                        break;
                    }
                }
            }
        }
        if (max == 0) {
            return "";
        }
        else {
            return str.get(max-1);
        }
    }
}
