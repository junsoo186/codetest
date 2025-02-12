class FlexibleWorkSystem {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int peoples = schedules.length; // 사원 수

        for (int i = 0; i < peoples; i++) {
            int appointmentTime = schedules[i] / 100 * 60 + schedules[i] % 100 + 10;
            int validDays = 0;
            for (int j = 0; j < timelogs[i].length; j++) {
                int currentDay = (startday + j) % 7;
                if (currentDay != 0 && currentDay != 6) {
                    int setTime = timelogs[i][j] / 100 * 60 + timelogs[i][j] % 100;
                    if (appointmentTime >= setTime) {
                        validDays++;
                    }
                }
            }

            if (validDays == 5) {
                answer++;
            }
        }

        return answer;
    }
}
