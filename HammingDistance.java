public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int count = 0;
        String a = toBinary(x);
        String b = toBinary(y);
        if(a.length() < b.length()) {
            a = addPadding(a,b.length()-a.length());
        }
        else {
            b = addPadding(b, a.length()-b.length());
        }
        for(int i = 0; i < Math.min(a.length(),b.length()); i++) {
            if(a.charAt(i) != b.charAt(i))
                count++;
        }
        return count+Math.abs(a.length()-b.length());
    }

    public String toBinary(int x) {
        StringBuffer binary = new StringBuffer();
        if(x != 0) {
            while (x != 1) {
                if (x % 2 == 1) {
                    binary.append(1);
                } else {
                    binary.append(0);
                }
                x = x / 2;
            }
            binary.append(1);
        }
        else {
            binary.append(0);
        }
        return binary.toString();
    }
    public String addPadding(String str,int padCount) {
        StringBuffer ret = new StringBuffer(str);
        while(padCount-- > 0) {
            ret.append(0);
        }
        return ret.toString();
    }
}
