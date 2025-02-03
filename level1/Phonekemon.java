import java.util.HashSet;

class Phonekemon {
    public int solution(int[] nums) {
        
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        
      
        for (int num : nums) {
            uniqueNumbers.add(num);
        }
        
        if (uniqueNumbers.size() > nums.length/2) {
            return nums.length/2;
        }
        return uniqueNumbers.size();
    }
}