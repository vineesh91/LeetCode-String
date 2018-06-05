import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public int calPoints(String[] ops) {
        int N = -1;
        int sum = 0;
        int k = 0;
        List<Integer> scores = new ArrayList<>();
        for(String op : ops) {
            switch(op) {
                case "+" :  k = scores.get(N)+scores.get(N-1);
                            scores.add(k);
                            sum += k;
                            N++;
                            break;
                case "D" :  k = 2 * scores.get(N);
                            scores.add(k);
                            sum += k;
                            N++;
                            break;
                case "C" :  k = scores.get(N);
                            sum -= k;
                            scores.remove(N);
                            N--;
                            break;
                default:    k =  Integer.parseInt(op);
                            sum += k;
                            scores.add(k);
                            N++;
                            break;
            }
        }
        return sum;
    }
}
