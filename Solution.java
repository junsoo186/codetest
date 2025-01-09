
import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int xMove = board[0].length;
        Stack<Integer> finder = new Stack<>();
        int answer = 0;
        for(int i=0; i<moves.length; i++){
           for(int j=0; j<board.length; j++){
            if (board[j][moves[i]] !=0) {
                finder.add(board[j][moves[i]]);
                board[j][moves[i]] = 0;
            }
           }
        }


        return answer;
    }
}