import java.util.HashMap;
import java.util.Map;

class MostReceivedGifts {
    

    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        // 준 선물
        Map<String, Integer> give = new HashMap<>();
        // 받은 선물
        Map<String, Integer> get = new HashMap<>();
        // 선물 지수
        Map<String, Integer> giftIndex = new HashMap<>();
        // 받은 선물 수
        Map<String, Integer> total = new HashMap<>();
        
        // 친구들 초기화
        for (String name : friends) {
            give.put(name, 0);
            get.put(name, 0);
            total.put(name, 0);
            giftIndex.put(name, 0);
        }
        
        // 선물 기록 처리
        for (String trade : gifts) {
            String[] who = trade.split(" ");
            give.put(who[0], give.get(who[0]) + 1);  // 선물을 준 횟수 증가
            get.put(who[1], get.get(who[1]) + 1);    // 선물을 받은 횟수 증가
        }
        
        // 선물 지수 계산
        for (String name : friends) {
            giftIndex.put(name, give.get(name) - get.get(name)); // 선물 지수 = 준 선물 - 받은 선물
        }
        
        // 선물 주고받은 기록을 기준으로 다음 달 선물 받기 예측
        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                String A = friends[i];
                String B = friends[j];
                int aCount = 0;
                int bCount = 0;
                
                // A와 B 간의 선물 주고받은 횟수 카운팅
                for (String trade : gifts) {
                    String[] who = trade.split(" ");
                    if (who[0].equals(A) && who[1].equals(B)) {
                        aCount++;
                    } else if (who[0].equals(B) && who[1].equals(A)) {
                        bCount++;
                    }
                }
                
                // 선물 주고받은 횟수 비교
                if (aCount > bCount) {
                    total.put(A, total.get(A) + 1);  // B가 선물을 받음
                } else if (bCount > aCount) {
                    total.put(B, total.get(B) + 1);  // A가 선물을 받음
                } else {
                    // 선물 주고받은 횟수가 같을 때 선물 지수 비교
                    if (giftIndex.get(A) < giftIndex.get(B)) {
                        total.put(B, total.get(B) + 1);  // B가 선물을 받음
                    } else if (giftIndex.get(A) > giftIndex.get(B)) {
                        total.put(A, total.get(A) + 1);  // A가 선물을 받음
                    }
                }
            }
        }
        
        // 가장 많은 선물을 받을 친구의 선물 수 찾기
        for (int count : total.values()) {
            answer = Math.max(answer, count);
        }
        
        return answer;
    }

}
