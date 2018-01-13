import java.util.ArrayList;

public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        boolean prevOne = false;
        int tcnt = 0;
        int zcnt = 0;
        int ocnt = 0;
        ArrayList<Integer> arr = new ArrayList();
        ArrayList<Integer> arrone = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if(prevOne == true) {
                    arr.clear();
                }
                ocnt = 0;
                zcnt++;
                if (arrone.contains(zcnt)) {
                    tcnt++;
                    arrone.remove(Integer.valueOf(zcnt));
                }
                arr.add(zcnt);
                prevOne = false;
            }
            else {
                if(prevOne == false) {
                    arrone.clear();
                }
                zcnt = 0;
                ocnt++;
                arrone.add(ocnt);
                if (arr.contains(ocnt)) {
                    tcnt++;
                    arr.remove(Integer.valueOf(ocnt));

                }
                prevOne = true;
            }
        }
        return tcnt;
    }
}
