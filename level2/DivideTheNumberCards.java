class DivideTheNumberCards {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            gcdA = gcd(gcdA, arrayA[i]);
        }
        int gcdB = arrayB[0];
        for (int i = 1; i < arrayB.length; i++) {
            gcdB = gcd(gcdB, arrayB[i]);
        }
        boolean validA = true;
        for (int num : arrayB) {
            if (num % gcdA == 0) {
                validA = false;
                break;
            }
        }
        boolean validB = true;
        for (int num : arrayA) {
            if (num % gcdB == 0) {
                validB = false;
                break;
            }
        }
        int answer = 0;
        if (validA) {
            answer = Math.max(answer, gcdA);
        }
        if (validB) {
            answer = Math.max(answer, gcdB);
        }
        return answer;
    }
    
    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
