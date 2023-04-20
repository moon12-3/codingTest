import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            hm.put(players[i], i);
        }
        for(int i = 0; i < callings.length; i++) {
            String t = players[hm.get(callings[i])];
            players[hm.get(callings[i])] = players[hm.get(callings[i])-1];
            players[hm.get(callings[i])-1] = t;
            hm.put(callings[i], hm.get(callings[i])-1);
            hm.put(players[hm.get(callings[i])+1], hm.get(callings[i])+1);
        }
    
        return players;
    }
}
