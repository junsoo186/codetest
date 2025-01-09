class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] box = quiz[i].split("=");
            int a = Integer.parseInt(box[1].trim());
            String b = box[0];
            int c = calc(b);
            if (a == c) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }

    public int calc(String b) {
        String[] calcBox;

        if (b.contains("+")) {
            calcBox = b.split("\\+");
            return Integer.parseInt(calcBox[0].trim()) + Integer.parseInt(calcBox[1].trim());
        } else {
            calcBox =b.split(" ");
            return Integer.parseInt(calcBox[0].trim()) - Integer.parseInt(calcBox[2].trim());
        } 
        
    }
}
