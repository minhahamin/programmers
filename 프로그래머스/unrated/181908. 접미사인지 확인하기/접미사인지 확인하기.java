 class Solution {
    public static int solution(String my_string, String is_suffix) {
        int suffixLength = is_suffix.length();
        if (suffixLength > my_string.length()) {
            return 0;
        }
        String suffix = my_string.substring(my_string.length() - suffixLength);
        if (suffix.equals(is_suffix)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix1 = "ana";
        String is_suffix2 = "nan";
        String is_suffix3 = "wxyz";
        String is_suffix4 = "abanana";
        int result1 = solution(my_string, is_suffix1);
        int result2 = solution(my_string, is_suffix2);
        int result3 = solution(my_string, is_suffix3);
        int result4 = solution(my_string, is_suffix4);
        System.out.println("my_string: " + my_string);
        System.out.println("is_suffix1: " + is_suffix1);
        System.out.println("Result1: " + result1);
        System.out.println("is_suffix2: " + is_suffix2);
        System.out.println("Result2: " + result2);
        System.out.println("is_suffix3: " + is_suffix3);
        System.out.println("Result3: " + result3);
        System.out.println("is_suffix4: " + is_suffix4);
        System.out.println("Result4: " + result4);
    }
}
