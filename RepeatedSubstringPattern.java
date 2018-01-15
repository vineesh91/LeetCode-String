import java.util.Hashtable;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        Hashtable<Character,Integer> hc = new Hashtable<>();
        Hashtable<String, Integer> ht  = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            if (hc.containsKey(s.charAt(i))) {
                if ( (2*i) <= s.length()) {
                    if (s.substring(0,i).equals(s.substring(i,2*i))) {
                        ht.put(s.substring(0,i),1);
                    }
                }
            }
            else {
                hc.put(s.charAt(i),1);
            }

        }

        for (String sub : ht.keySet()) {
            int len = 1;
            int mul = 0;
            while (len * sub.length() <= s.length()) {
                int end = len * sub.length();
                if (sub.equals(s.substring(mul, end))) {
                    if (end == s.length()) {
                        return true;
                    }
                    else {
                        mul = end;
                        len++;
                    }
                }
                else {
                    break;
                }
            }
        }
        return false;
    }
}
