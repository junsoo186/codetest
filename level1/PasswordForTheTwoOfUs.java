class PasswordForTheTwoOfUs {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        char[] findbox = new char[26];

        for (int i = 0; i < 26; i++) {
            findbox[i] = (char) ('a' + i);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int position = c - 'a';
            int steps = 0;

            while (steps < index) {
                position = (position + 1) % 26;
                char nextChar = findbox[position];
                
                if (skip.indexOf(nextChar) == -1) {
                    steps++;
                }
            }

            answer.append(findbox[position]);
        }

        return answer.toString();
    }
}
