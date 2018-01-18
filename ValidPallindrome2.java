public class ValidPallindrome2 {
    public boolean validPalindrome(String s) {
        int cnt = 0;
        int k1 = 0;
        int k2 = 0;
        boolean chkdagain = false;
        boolean sec = true;
        boolean otheroption = true;
        int i = 0;
        int j = s.length() - i - 1;
        while (j >= i) {
            if(cnt > 1) {
                if (chkdagain) {
                    return false;
                }
                else {
                    i = k1;
                    j = k2;
                    cnt = 0;
                    sec = false;
                    otheroption = true;
                }
            }
            if(s.charAt(i) != s.charAt(j)) {
                cnt++;

                if(otheroption == true) {
                    otheroption = false;
                    k1 = i;
                    k2 = j;
                    if (s.charAt(i + 1) == s.charAt(j) && sec) {
                        i++;
                    } else if (s.charAt(i) == s.charAt(j - 1)) {
                        j--;
                        chkdagain = true;
                    } else {
                        return false;
                    }
                }
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
