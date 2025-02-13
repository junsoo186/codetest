
class Babbling1 {
    public int solution(String[] babbling) {
        String[] canSay = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            String temp = word;
          
            for (String say : canSay) {
                temp = temp.replace(say, " ");
            }

           
            if (temp.trim().isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}