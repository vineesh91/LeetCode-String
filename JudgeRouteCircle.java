import java.util.ArrayList;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U' : if(arr.contains('D')) {
                    arr.remove(Character.valueOf('D'));
                }
                else {
                    arr.add('U');
                }
                break;
                case 'D' : if(arr.contains('U')) {
                    arr.remove(Character.valueOf('U'));
                }
                else {
                    arr.add('D');
                }
                    break;
                case 'L' : if(arr.contains('R')) {
                    arr.remove(Character.valueOf('R'));
                }
                else {
                    arr.add('L');
                }
                    break;
                case 'R' : if(arr.contains('L')) {
                    arr.remove(Character.valueOf('L'));
                }
                else {
                    arr.add('R');
                }
                    break;
                default:break;
            }
        }
        if (arr.isEmpty())
            return true;
        else
            return false;
    }
}
