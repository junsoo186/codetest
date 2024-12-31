class Dice3 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        int[] numburBox = new int[7];
        int max = 0;
        for (int i = 0; i < dice.length; i++) {
            max = Math.max(max, ++numburBox[dice[i]]);
        }
        
        int answer = 0;

        for (int i = 1; i < numburBox.length; i++) {
            if (numburBox[i] == 4) {
                answer = 1111 * i;
                return answer;
            }
        }

        for (int i = 1; i < numburBox.length; i++) {
            if (numburBox[i] == 3) {
                int remaining = finder(1, i, numburBox);
                answer = (10 * i + remaining) * (10 * i + remaining);
                return answer;
            }
        }

        for (int i = 1; i < numburBox.length; i++) {
            if (numburBox[i] == 2) {
                int second = finder(2, i, numburBox);
                if (second != 0) {
                    answer = (i + second) * Math.abs(i - second);
                } else {
                    int leftA = finder(1, 0, numburBox);
                    answer = leftA * finder(1, leftA, numburBox);
                }
                return answer;
            }
        }

        answer = finder(1, 0, numburBox);
        return answer;
    }

    public int finder(int a, int b, int[] numburBox) {
        if (b == 0) {
            for (int i = 1; i < numburBox.length; i++) {
                if (numburBox[i] == a) {
                    return i;
                }
            }
        } else {
            for (int i = 1; i < numburBox.length; i++) {
                if (numburBox[i] == a && i != b) {
                    return i;
                }
            }
        }
        return 0;
    }
}
