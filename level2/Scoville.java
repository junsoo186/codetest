import java.util.ArrayList;
import java.util.List;

class Scoville {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int result = 0;
        List<Integer> levels = new ArrayList<>();
        for (Integer num : scoville) {
            levels.add(num);
        }
        while (K > result) {
            int x = levels.get(0);
            int y = levels.get(1);
            result = x + (y * 2);
            if (K > result) {
                levels.remove(0);
                levels.remove(0);
                levels.add(0, result);
            }
            answer++;
        }

        return answer;
    }
}