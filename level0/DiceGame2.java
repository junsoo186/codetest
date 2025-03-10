class DiceGame2 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int caseA = a + b + c ;
        int caseB = (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int caseC = (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        if(a == b && b == c){
           answer = caseA * caseB * caseC;
        }else if(a == b ||b == c||a == c ){
            answer = caseA * caseB;
        }else{
            answer = caseA;
        }
        return answer;
    }
}