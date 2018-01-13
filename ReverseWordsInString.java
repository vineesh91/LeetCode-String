public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String w : str) {
            StringBuffer wb = new StringBuffer(w);
            wb.reverse();
            sb.append(wb);
            sb.append(" ");
        }
        return sb.substring(0, sb.length()-1);
    }
}
