



public class Solution {
   
        char x;
        
                public int solution(String s) {
                    int answer = 0;
                    int xCount = 0;
                    int notCount =0;
                StringBuilder sb = new StringBuilder(s);
                
           
          
           for (int i = 0; i < s.length(); i++) {
            if (xCount == 0) {
                x = sb.charAt(i);
            }
            if (x == sb.charAt(i)) {
                xCount++;
            }else {
                notCount++;
            }
            if (xCount == notCount ) {
                xCount = 0;
                notCount = 0;
                answer++; 
            }
       
   }

            return answer;
        }
    
}