class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        String st = "abcdefghijklmnopqrstuvwxyz0123456789-_.";
        for(int i = 0; i<new_id.length(); i++){
            String ch = new_id.charAt(i) + "";
            if(st.contains(ch)){
                answer += ch;
            }
        }
        //3단계
        while(answer.contains("..")){
            answer = answer.replace("..",".");
        }
        //4단계
        if(answer.startsWith(".")){
            answer = answer.substring(1);
        }
        if(answer.endsWith(".")){
            answer = answer.substring(0,answer.length()-1);
        }
        //5단계
        if(answer.equals("")){
            answer="a";
        }
        //6단계
        if(answer.length()>=16){
            answer = answer.substring(0,15);
        }
         if(answer.endsWith(".")){
            answer = answer.substring(0,answer.length()-1);
        }
        //7단계
        while(answer.length()<=2){
            answer += answer.substring(answer.length()-1);
        }
        System.out.println(answer);
        return answer;
    }
}