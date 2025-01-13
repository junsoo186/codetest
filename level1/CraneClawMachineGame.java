import java.util.Stack;

class CraneClawMachineGame {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> finder = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int column = moves[i] - 1;
            boolean found = false;

            for (int j = 0; j < board.length; j++) {
                if (board[j][column] != 0) {
                    int doll = board[j][column];
                    board[j][column] = 0;

                    if (!finder.isEmpty() && finder.peek() == doll) {
                        finder.pop();
                        answer += 2;
                    } else {
                        finder.push(doll);
                    }
                    found = true;
                    break;
                }
            }
        }

        return answer;
    }
}
