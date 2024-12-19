import java.util.HashMap;
import java.util.HashSet;

class Report {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
        }

        for (String rep : report) {
            String[] reportCard = rep.split(" ");
            String reporter = reportCard[0];
            String reported = reportCard[1];
            reportMap.get(reported).add(reporter);
        }

        HashMap<String, Integer> notifyCount = new HashMap<>();
        for (String id : id_list) {
            notifyCount.put(id, 0);
        }

        for (String reported : reportMap.keySet()) {
            HashSet<String> reporters = reportMap.get(reported);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    notifyCount.put(reporter, notifyCount.get(reporter) + 1);
                }
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = notifyCount.get(id_list[i]);
        }

        return answer;
    }
}
