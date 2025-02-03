class Collatz {
    public int solution(int num) {
        int answer = 0;
        long calc= num;
        while (calc != 1 && answer <= 500) {
            if (calc % 2 == 0) {
                calc = calc / 2;
            } else {
                calc = calc * 3 + 1;
            }
            answer++;  
        }
        if (answer > 500) {
            return -1;
        }
        return answer;
    }
}