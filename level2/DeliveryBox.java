import java.util.Stack;

class DeliveryBox {

    public int solution(int[] order) {
        int answer = 0;
        int count = 1; // 현재 택배 번호
        Stack<Integer> sub = new Stack<>(); 

        for (int box : order) {
            while (count <= box) { 
                sub.push(count);
                count++;
            }

            if (!sub.isEmpty() && sub.peek() == box) {
                sub.pop();
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
