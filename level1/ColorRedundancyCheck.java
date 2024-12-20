class ColorRedundancyCheck {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        if(board[h][w].equals(board[h][w+1])&&w<board[h].length){
            answer++;
        }
        if(board[h][w].equals(board[h][w-1])&&w>0){
            answer++;
        }
        if(board[h][w].equals(board[h+1][w])&& h < board[w].length){
            answer++;
        }
        if(board[h][w].equals(board[h-1][w])&& h>0){
            answer++;
        }
        return answer;
    }
}