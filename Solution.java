class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        char[] findbox = new char[26];
        for (int i = 0; i < 26; i++) {
            findbox[i] = (char) ('a' + i);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
              for (int j = 0; j < skip.length(); j++) {
                int started= c - 'a';
                int skiped = skip.charAt(j) - 'a';
                int sum = started + index;
                if (started < skiped && sum > skiped) {
                    ++ sum ;

                }
                sum %= 26;
                
                answer.append(findbox[sum]);
            }
        }
        return answer.toString();
    }
}