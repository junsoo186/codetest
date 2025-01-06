class AContinuousNumber {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int midle = total/num; 
        if (total%num != 0) {
            midle++;
        }
        
        System.out.println(midle);
        int first =  midle - num/2;
        System.out.println(first);
        for(int i = 0  ; i < num ; i++ ){
          answer[i] = first++;
        }
        
        return answer;
    }
    public static void main(String[] args) {
        AContinuousNumber classs = new AContinuousNumber();
        
        System.out.println(classs.solution(4, 14));
    }
}