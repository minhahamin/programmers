import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        List<Integer> result = new ArrayList<>();

        if (n == 1) {
            result = sliceList(num_list, 0, b);
        } else if (n == 2) {
            result = sliceList(num_list, a, num_list.length - 1);
        } else if (n == 3) {
            result = sliceList(num_list, a, b);
        } else if (n == 4) {
            for (int i = a; i <= b; i += c) {
                result.add(num_list[i]);
            }
        }

        return convertToArray(result);
    }

    private List<Integer> sliceList(int[] num_list, int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            result.add(num_list[i]);
        }
        return result;
    }

    
    //convertToArray 메소드는 리스트를 배열로 변환하여 반환함
    private int[] convertToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
