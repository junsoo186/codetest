
import java.util.HashMap;

class IncompletePlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String , Integer> player = new HashMap<>();
        for(String name : participant){
            player.put(name , player.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            player.put(name, player.get(name)-1);
            if (player.get(name) == 0) {
                player.remove(name);
            }
        }

        for (String name : player.keySet()) {
            answer = name;
        }
        return answer ;
    }
}