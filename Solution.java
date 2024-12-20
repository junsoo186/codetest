
import java.util.HashMap;

class Solution {
    public int solution(String dartResult) {
        int boxNumber = 1;
        int answer = 0;
        HashMap<String, Integer> scoreBox = new HashMap<>();
     
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
        

            scoreBox.put(boxNumber+"box", c - '0');
            
            
        }
      
            
        return answer;
    }
}