
public class AddBinary {
    public String addBinary(String a, String b) {
        int prev = 0;
        StringBuilder ret = new StringBuilder();
        StringBuilder s1 = new StringBuilder(a);
        StringBuilder s2 = new StringBuilder(b);
        a = s1.reverse().toString();
        b= s2.reverse().toString();
        int len = Math.min(a.length(),b.length());
        for (int i = 0; i < len; i++) {
            int s = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + prev;
            if (s == 0) {
                ret.append(0);
                prev = 0;
            }
            else if (s == 1) {
                ret.append(1);
                prev = 0;
            }
            else if (s == 2) {
                ret.append(0);
                prev = 1;
            }
            else {
                ret.append(1);
                prev = 1;
            }
        }
        if (a.length() > b.length()) {
            for (int i = b.length(); i < a.length(); i++) {
                int s = Character.getNumericValue(a.charAt(i)) + prev;
                if (s == 0) {
                    ret.append(0);
                    prev = 0;
                }
                else if (s == 1) {
                    ret.append(1);
                    prev = 0;
                }
                else if (s == 2) {
                    ret.append(0);
                    prev = 1;
                }
            }
        }
        else if (b.length() > a.length()) {
            for (int i = a.length(); i < b.length(); i++) {
                int s = Character.getNumericValue(b.charAt(i)) + prev;
                if (s == 0) {
                    ret.append(0);
                    prev = 0;
                }
                else if (s == 1) {
                    ret.append(1);
                    prev = 0;
                }
                else if (s == 2) {
                    ret.append(0);
                    prev = 1;
                }
            }
        }
        if (prev == 1) {
            ret.append(1);
        }
        return ret.reverse().toString();
    }
}
