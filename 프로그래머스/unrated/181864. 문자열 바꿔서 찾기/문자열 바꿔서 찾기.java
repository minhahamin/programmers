class Solution {
    public int solution(String myString, String pat) {
        String transformed = myString.replace("A","X").replace("B","A").replace("X", "B");   //mystring을 A를 B로 B를 A로 바꾼 후 transformed에 저장
        
        if(transformed.contains(pat)){    //transformed에 pat이 포함되어 있는 지 확인하여
            return 1;    // 포함되면 1 반환
        }
        else{
            return 0;   // 아니면 0 반환
        }
    }
}