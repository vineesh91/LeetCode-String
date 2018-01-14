public class ReverseVowels {
    public String reverseVowels(String s) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        String vow = "aeiou";
        for(int i = s.length()-1; i >= 0; i--) {
            if(vow.contains(""+s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if(vow.contains(""+s.charAt(i))) {
                sb2.append(sb.charAt(k));
                k++;
            }
            else {
                sb2.append(s.charAt(i));
            }
        }
        return sb2.toString();
    }
}
