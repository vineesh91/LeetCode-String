import java.util.*;

public class SubdomainVisitCount {
    HashMap<String, Integer> domainCounter = new HashMap<>();
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ret = new ArrayList<String>();
        for(String cpdomain : cpdomains) {
            String[] visitDomPair = cpdomain.split(" ");
            String[] doms = visitDomPair[1].split("\\.");
            String subDoms = "";
            for(int i = doms.length-1; i > -1; i--) {
                if( i != doms.length-1) {
                    subDoms = doms[i]+"."+subDoms;
                }
                else {
                    subDoms = doms[i];
                }
                if(domainCounter.containsKey(subDoms)) {
                    domainCounter.put(subDoms,domainCounter.get(subDoms) + Integer.parseInt(visitDomPair[0]));
                }
                else {
                    domainCounter.put(subDoms,Integer.parseInt(visitDomPair[0]));
                }
            }
        }
        Set keys = domainCounter.keySet();
        Iterator<String> itr = keys.iterator();
        while(itr.hasNext()) {
            String ky = itr.next();
            ret.add(Integer.toString(domainCounter.get(ky)) + " "+ky);
        }
        return ret;
    }
}
