class Solution {
    public int solution(int[] date1, int[] date2) {
        //비교할 년도, 월, 날짜 추출
        int year1 = date1[0];
        int month1 = date1[1];
        int day1 = date1[2];
        
        int year2 = date2[0];
        int month2 = date2[1];
        int day2 = date2[2];
        
        //연도 비교
        if(year1 < year2){
            return 1;
        }
        else if(year1 > year2){
            return 0;
        }
        
        //연도가 같은 경우 월 비교
        if (month1 < month2){
            return 1;
        }
        else if(month1 > month2){
            return 0;
        }
        
        //월도 같은 경우 날짜 비교
        if(day1 < day2){
            return 1;
        }
        else if(day1 > day2){
            return 0;
        }
        
        //날짜도 같은 경우
        return 0;
    }
}