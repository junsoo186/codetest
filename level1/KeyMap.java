class KeyMap {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] count = new int['Z' - 'A' + 1];
        

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {

                if (i == 0 ||  count[keymap[i].charAt(j) - 'A'] > j+1 ) {
                    count[keymap[i].charAt(j) - 'A'] = j +1;
                }
                
            }
           
        }
        for (int i = 0; i < targets.length; i++) {
            answer[i] = 0 ;
            for (int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                if('A' <= c && c <= 'Z'){
                    int idx = c - 'A';
                 if ( count[idx] > j) {
                    answer[i] = answer[i] + j;
                 }
                }else{
                    answer[i] = -1;
                    i++;
                } 
                

            }
        }

       
        return answer;
    }
   
}