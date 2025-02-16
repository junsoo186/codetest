class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        boolean chulSu = false;
        boolean youngHee = false;
        int countC = 0;
        int countY = 0;
        int sizes = arrayA.length;
        int x = arrayA[0];
        int y = arrayB[0];
        while (countC < sizes && countY < sizes && countC != 0 && countY != 0 ) { 
            if(arrayA[countC]%x == 0){
                countC++;
            }else{
                countC = 0;
                x--;
            }
            if (countC == sizes) {
                chulSu = true;
            }
            if(arrayB[countY]%y == 0){
                countY++;
            } else{
                countY = 0; 
                y--;
            }

            if (countY == sizes) {
                youngHee = true;
            }
        }
        
        if(chulSu == true && youngHee == false){
            for(int i = 0; i < sizes; i++ ){
                if (arrayB[i]%x == 0){
                    chulSu = false;
                    break;
                }
            }
            answer = x;
        }else if( chulSu == false&&youngHee == true){
            for(int i = 0; i < sizes; i++ ){
                if (arrayA[i]%y == 0){
                    youngHee = false;
                    break;
                }
            }
            answer = y;
        
           }else{
            answer = 0;
           }
        return answer;
    }
}