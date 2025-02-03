public class PushKeyPad {
    public String solution(int[] numbers, String hand) {
        int[][] keyPad = {
            {3, 1}, {0, 0}, {0, 1}, {0, 2},
            {1, 0}, {1, 1}, {1, 2},
            {2, 0}, {2, 1}, {2, 2}
        };
        
        int[] left = {3, 0};
        int[] right = {3, 2};
        
        StringBuilder result = new StringBuilder();
        
        for (int num : numbers) {
            int[] target = keyPad[num];
            
            if (num == 1 || num == 4 || num == 7) {
                result.append("L");
                left = target;
            } else if (num == 3 || num == 6 || num == 9) {
                result.append("R");
                right = target;
            } else {
                int leftDist = Math.abs(left[0] - target[0]) + Math.abs(left[1] - target[1]);
                int rightDist = Math.abs(right[0] - target[0]) + Math.abs(right[1] - target[1]);
                
                if (leftDist < rightDist) {
                    result.append("L");
                    left = target;
                } else if (leftDist > rightDist) {
                    result.append("R");
                    right = target;
                } else {
                    if (hand.equals("left")) {
                        result.append("L");
                        left = target;
                    } else {
                        result.append("R");
                        right = target;
                    }
                }
            }
        }
        
        return result.toString();
    }
}