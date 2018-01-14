public class ReverseString2 {
    public String reverseStr(String s, int k) {
        boolean twice = false;
        StringBuffer sf = new StringBuffer();
        StringBuffer sb = new StringBuffer();
        for ( int i = 1; i <= s.length(); i++) {
            sb.append(s.charAt(i-1));
            if (i%k == 0) {
                if(twice == true) {
                    twice = false;
                }
                else {
                    twice = true;
                    sb.reverse();
                }
                sf.append(sb);
                sb = new StringBuffer();
            }
        }
        if (twice == false) {
            sb.reverse();
            sf.append(sb);
        }
        else {
            sf.append(sb);
        }
        return sf.toString();
    }
}
