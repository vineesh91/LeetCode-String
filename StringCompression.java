public class StringCompression {
    public int compress(char[] chars) {
        int diff = 0;
        int cnt = 0;
        int index = -1;
        int pos = 0;
        String len = "";
        Character prev = ' ';
        for (Character c : chars) {
            if (c == prev && index != -1) {
                cnt++;
                int plen = len.length();
                len = Integer.toString(cnt);
                int k = pos;
                for (int i = 0; i < len.length(); i++) {
                    chars[k] = len.charAt(i);
                    k++;
                }
                if (plen < len.length() && plen != 0) {
                    diff++;
                    index++;
                }
            }
            else {
                if ( cnt == 1) {
                    diff--;
                }
                else {
                    index++;
                }
                cnt = 1;
                chars[index] = c;
                pos = index+1;
                diff += 2;
                index++;
                prev = c;
            }
        }
        if ( cnt == 1) {
            diff--;
        }
        return diff;
    }
}
