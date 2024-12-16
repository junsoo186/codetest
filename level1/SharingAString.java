public class SharingAString {
    public int solution(String s) {
        int answer = 0;
        int xCount = 0;
        int notCount = 0;
        char x = '0';

        for (int i = 0; i < s.length(); i++) {
            if (xCount == 0) {
                x = s.charAt(i);
            }

            if (s.charAt(i) == x) {
                xCount++;
            } else {
                notCount++;
            }

            if (xCount == notCount) {
                answer++;
                xCount = 0;
                notCount = 0;
            }
        }

        if (xCount != 0 || notCount != 0) {
            answer++;
        }

        return answer;
    }
}
