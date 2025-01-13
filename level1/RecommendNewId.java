class RecommendNewId {
    public String solution(String new_id) {
        String box = new_id.toLowerCase();

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < box.length(); i++) {
            char c = box.charAt(i);
            if (Character.isLetterOrDigit(c) || c == '-' || c == '_' || c == '.') {
                answer.append(c);
            }
        }
        
        String result = answer.toString();
        result = result.replaceAll("\\.{2,}", ".");

        if (result.startsWith(".")) {
            result = result.substring(1);
        }
        if (result.endsWith(".")) {
            result = result.substring(0, result.length() - 1);
        }

        if (result.isEmpty()) {
            result = "a";
        }

        if (result.length() > 15) {
            result = result.substring(0, 15);
            if (result.endsWith(".")) {
                result = result.substring(0, result.length() - 1);
            }
        }

        while (result.length() < 3) {
            result += result.charAt(result.length() - 1);
        }

        return result;
    }
}
