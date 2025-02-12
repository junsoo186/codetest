import java.util.HashMap;

class Solution {
    public int solution(String[] word) {
        int answer = 0;
        int sizes = word[1].length();
        String target = word[1];
        HashMap<Character,Integer> targetBox = new HashMap<>();

        for (Character ch : target.toCharArray()) {
            targetBox.put(ch , targetBox.get(ch)+1);
        }

        for (String p : word) {
            if (p.length() == sizes) {
                for (Character ch : p.toCharArray()) {
                    if (targetBox.get(ch) >= 1) {
                        
                        
                    }
                }
                
            }
        }
        return answer;
    }
}
