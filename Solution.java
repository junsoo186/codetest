
public class Solution {
    char[][] parkMap;
    int curI = 0;
    int curJ = 0;

    public int[] solution(String[] park, String[] routes) {

        String lengthfinder = park[0];

        parkMap = new char[park.length][lengthfinder.length()];
        for (int i = 0; i < park.length; i++) {
            lengthfinder = park[i];
            for (int j = 0; j < lengthfinder.length(); j++) {
                parkMap[i][j] = lengthfinder.charAt(j);
                if (lengthfinder.charAt(j) == 'S') {
                    curI = i;
                    curJ = j;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] splits = routes[i].split(" ");
            char way = splits[0].charAt(0);
            int sizes = Integer.parseInt(splits[1]);
            switch (way) {
                case 'W':
                    calc(false, false, sizes);
                    break;
                case 'S':
                    calc(true, true, sizes);
                    break;
                case 'N':
                    calc(true, false, sizes);
                    break;
                case 'E':
                    calc(false, true, sizes);
                    break;
            }

        }

        int[] answer = { curI, curJ };
        return answer;
    }

    public void calc(boolean isI, boolean isPlus, int sizes) {
        int savePointI = curI;
        int savePointJ = curJ;
        for (int i = 0; i < sizes; i++) {
            if (isI) {
                if (isPlus) {

                    if (curI < parkMap.length - 1 && 'X' !=  parkMap[curI + 1][curJ]) {

                        curI = curI + 1;
                    } else {
                        curI = savePointI;
                        return;
                    }

                } else {
                    if (curI > 0 && 'X' !=  parkMap[curI - 1][curJ]) {
                        curI = curI - 1;
                    } else {
                        curI = savePointI;
                        return;
                    }
                }

            } else {
                if (isPlus) {
                    if (curJ < parkMap[0].length - 1 && 'X' != parkMap[curI][curJ + 1]) {
                        curJ = curJ + 1;
                    } else {
                        curJ = savePointJ;
                        return;
                    }
                } else {
                    if (curJ > 0 && 'X' != parkMap[curI][curJ - 1]) {
                        curJ = curJ - 1;
                    } else {
                        curJ = savePointJ;
                        return;
                    }
                }

            }
        }
    }
}