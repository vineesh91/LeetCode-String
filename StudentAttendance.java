public class StudentAttendance {
    public boolean checkRecord(String s) {
        int ab = 0;
        int lt  =0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                ab++;
                lt = 0;
            }
            else if (s.charAt(i) == 'L') {
                lt++;
            }
            else {
                lt = 0;
            }
            if (ab > 1 || lt > 2) {
                return false;
            }
        }
        return true;
    }
}
