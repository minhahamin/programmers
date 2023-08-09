import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> groupCounts = new HashMap<>();

        // 문자열들을 길이별로 그룹화하고 그룹 크기를 계산
        for (String str : strArr) {
            int len = str.length();
            groupCounts.put(len, groupCounts.getOrDefault(len, 0) + 1);
        }

        // 가장 개수가 많은 그룹의 크기 찾기
        int maxGroupSize = 0;
        for (int size : groupCounts.values()) {
            maxGroupSize = Math.max(maxGroupSize, size);
        }

        return maxGroupSize;
        }
    }
