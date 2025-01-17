import java.util.HashSet;
import java.util.Set;

class TheHighestAndLowestRanksOfTheLotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int equal = 0;
        Set<Integer> known = new HashSet<>();

        for (int num : lottos) {
            if (num == 0) {
                zero++;
            } else {
                known.add(num);
            }
        }

        for (int num : win_nums) {
            if (known.contains(num)) {
                equal++;
            }
        }

        int max = zero + equal;
        int min = equal;

        answer[0] = getRank(max);
        answer[1] = getRank(min);

        return answer;
    }

    private int getRank(int matchCount) {
        switch (matchCount) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
