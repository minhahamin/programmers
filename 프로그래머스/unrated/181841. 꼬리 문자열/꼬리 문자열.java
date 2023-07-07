class Solution {
    public String solution(String[] str_list, String ex) {
       StringBuilder tailString = new StringBuilder();

        for (String str : str_list) {    //주어진 문자열 리스트를 순회하면서
            if (!str.contains(ex)) {    //ex를 포함하지 않는 경우에만 tailString 에 추가
                tailString.append(str);
            }
        }

        return tailString.toString();   //tailString을 문자열로 반환
    }
}