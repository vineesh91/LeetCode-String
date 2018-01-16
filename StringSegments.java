public class StringSegments {
    public int countSegments(String s) {
        int len;
        if(s.length() >= 1 && s.charAt(0) != ' ') {
            len = 1;
        }
        else {
            len = 0;
        }
        Character prev = 'a';
        for(int i = 0; i < s.length(); i++) {
            if (prev == ' ' && s.charAt(i) != ' ') {
                len++;
            }
            prev=  s.charAt(i);
        }
        return len;
    }
}
