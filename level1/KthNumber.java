import java.util.ArrayList;
import java.util.Arrays;

class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int a = 0; a < commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            
            int[] box = Arrays.copyOfRange(array, i - 1, j);  
            Arrays.sort(box);
            answer.add(box[k - 1]);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}