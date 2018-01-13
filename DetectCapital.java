public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        String f = word.substring(0,1);
        String sub = word.substring(1);
        String uw = sub.toUpperCase();
        String lw = sub.toLowerCase();
        if (sub.equals(uw) && f.equals(f.toUpperCase()))
            return true;
        if (sub.equals(lw))
            return true;
        else
            return false;
    }
}
