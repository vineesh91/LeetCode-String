public class ComplexMultiplication {
    public String complexNumberMultiply(String a, String b) {
        StringBuilder sb = new StringBuilder();
        String a1 = "";
        String a2 = "";
        String b1 = "";
        String b2 = "";
        for(int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '+') {
                a1 = a.substring(0,i);
                a2 = a.substring(i+1,a.length()-1);
                break;
            }
        }
        for(int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '+') {
                b1 = b.substring(0,i);
                b2 = b.substring(i+1,b.length()-1);
                break;
            }
        }
        sb.append((Integer.parseInt(a1)*Integer.parseInt(b1))+(Integer.parseInt(a2)*Integer.parseInt(b2)*(-1)));
        sb.append('+');
        sb.append((Integer.parseInt(a1)*Integer.parseInt(b2))+(Integer.parseInt(a2)*Integer.parseInt(b1)));
        sb.append('i');
        return sb.toString();
    }
}
