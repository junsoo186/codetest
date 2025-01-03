public class Solution {
    public int solution(int[][] board) {
        
        int size1 = board.length;
        int size2 = board[0].length;
        int answer = size1*size2;
        int count = 0;
        boolean[][] boomBox = new boolean[size1][size2];
        int[] dx = new int[]{-1,0,1,-1,0,1,-1,0,1};
        int[] dy = new int[]{-1,-1,-1,0,0,0,1,1,1};
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                 int isBoom = board[i][j];
                 if(isBoom == 1){
                    for (int k = 0; k < 9; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && nx < size1 && ny >=0 && ny< size2){
                            if (  boomBox[nx][ny] == true  ) {
                                count--;
                            }
                            boomBox[nx][ny] = true; 
                            count++;
                        }
                    }
                 }
            }
            
        }
        return answer -=count;
    }
}
