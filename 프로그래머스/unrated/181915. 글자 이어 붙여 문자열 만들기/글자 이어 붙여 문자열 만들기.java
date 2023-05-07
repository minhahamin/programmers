class Solution {
    public String solution(String my_string, int[] index_list) {
        //문자열 한글자씩 탐색하면서 index_list에 해당하는 인덱스 글자를  string Builder에 추가한 후, 최종적으로 문자열로 반환하여 return 함
        StringBuilder sb = new StringBuilder();
        for (int index : index_list) {
            sb.append(my_string.charAt(index));
        }
        return sb.toString();
    }
}
