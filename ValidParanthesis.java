public class ValidParanthesis {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        int index = -1;
        int closed = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                sb.append(s.charAt(i));
                index++;
                closed++;
            }
            else {
                if (index < 0) {
                    return false;
                }
                if (s.charAt(i) == ')') {
                    if (sb.charAt(index) == '(') {
                        sb.deleteCharAt(index);
                        index--;
                        closed--;
                    }
                    else {
                        return false;
                    }
                }
                else if (s.charAt(i) == '}') {
                    if (sb.charAt(index) == '{') {
                        sb.deleteCharAt(index);
                        index--;
                        closed--;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    if (sb.charAt(index) == '[') {
                        sb.deleteCharAt(index);
                        index--;
                        closed--;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        if(closed != 0) {
            return false;
        }
        return true;
    }
}
