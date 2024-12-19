import java.util.HashMap;

class PersonalityTypeTester {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> scores = new HashMap<>();
        scores.put('R', 0);
        scores.put('T', 0);
        scores.put('C', 0);
        scores.put('F', 0);
        scores.put('J', 0);
        scores.put('M', 0);
        scores.put('A', 0);
        scores.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            char type1 = survey[i].charAt(0);
            char type2 = survey[i].charAt(1);
            int score = Math.abs(choices[i] - 4);

            if (choices[i] < 4) {
                scores.put(type1, scores.get(type1) + score);
            } else if (choices[i] > 4) {
                scores.put(type2, scores.get(type2) + score);
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(scores.get('R') >= scores.get('T') ? 'R' : 'T');
        result.append(scores.get('C') >= scores.get('F') ? 'C' : 'F');
        result.append(scores.get('J') >= scores.get('M') ? 'J' : 'M');
        result.append(scores.get('A') >= scores.get('N') ? 'A' : 'N');

        return result.toString();
    }
}
