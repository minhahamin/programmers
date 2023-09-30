public class Solution {
    public String[] solution(String[] strList) {
        // "l"과 "r"의 인덱스를 찾음
        int indexOfL = -1;
        int indexOfR = -1;
        for (int i = 0; i < strList.length; i++) {
            if (strList[i].equals("l")) {
                indexOfL = i;
                break;
            }
        }
        for (int i = 0; i < strList.length; i++) {
            if (strList[i].equals("r")) {
                indexOfR = i;
                break;
            }
        }

        // "l"이나 "r" 중 어느 것도 없는 경우 빈 배열을 반환
        if (indexOfL == -1 && indexOfR == -1) {
            return new String[0];
        }

        // "l"만 있는 경우 혹은 "l"이 "r"보다 먼저 나오는 경우
        if (indexOfR == -1 || (indexOfL != -1 && indexOfL < indexOfR)) {
            String[] result = new String[indexOfL];
            System.arraycopy(strList, 0, result, 0, indexOfL);
            return result;
        }

        // "r"만 있는 경우 혹은 "r"이 "l"보다 먼저 나오는 경우
        if (indexOfL == -1 || indexOfR < indexOfL) {
            String[] result = new String[strList.length - indexOfR - 1];
            System.arraycopy(strList, indexOfR + 1, result, 0, strList.length - indexOfR - 1);
            return result;
        }

        return new String[0]; // 이 부분은 실행되지 않지만, 컴파일러의 요구사항을 충족하기 위해 추가
    }
}
