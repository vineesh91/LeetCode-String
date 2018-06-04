public class NumberOfLinesForString {
    public int[] numberOfLines(int[] widths, String S) {
        int count = 0;
        int line_number = 1;
        for(int i = 0; i < S.length(); i++) {
            int asc = S.charAt(i);
            if(count + widths[asc-97] > 100) {
                count = 0;
                count += widths[asc - 97];
                line_number++;
            }
            else {
                count += widths[asc - 97];
            }
        }
        int[] ret = new int[2];
        if(count == 0) {
            ret[0] = 0;
        }
        else {
            ret[0] = line_number;
        }
        ret[1] = count%100;
        return ret;
    }
}
