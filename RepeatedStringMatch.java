public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        if (A.length() == 0 || B.length() == 0) {
            return -1;
        }
        String trial;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(0)) {
                trial = A.substring(i,A.length());
                int k = 1;
                while (trial.length() < B.length()) {
                    trial = trial+A;
                    k++;
                }
                if(trial.substring(0,B.length()).equals(B)) {
                    return k;
                }
            }
        }
        return -1;
    }

}
