class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length ; i ++ ){
                int count = 0;            
            for(int j = 1; j < prices.length ; j++ ){
                int start = prices[i + count] ;
                if( start < prices[j]){
                    count++;
                }else{
                    if(count == 0){
                        answer[i] = 1;    
                    }
                    answer[i]=count + 2;    
                    count = 0;
                    break;            
        
                }
                
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 3} ;
        Solution calc = new Solution();
        System.out.println(calc.solution(a));
    }
}