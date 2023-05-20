public class Solution {
    public static void main(String[] args) {
        String myString = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        String result = solution(myString, s, e);
        System.out.println(result); // 출력: "ProgrammerS123"
    }

    public static String solution(String myString, int s, int e)    {
        StringBuilder sb = new StringBuilder(myString);
        for (int i = s; i <= e; i++) {
            sb.setCharAt(i, myString.charAt(e - (i - s)));
        }
        return sb.toString();
    }
}
