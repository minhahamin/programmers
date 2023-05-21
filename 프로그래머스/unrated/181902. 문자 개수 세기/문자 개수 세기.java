class Solution {
    public static int[] solution(String my_string) {
        int[] counts = new int[52];
        
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                counts[c - 'A']++;
            } else if (Character.isLowerCase(c)) {
                counts[c - 'a' + 26]++;
            }
        }
        
        return counts;
    }
    
    public static void main(String[] args) {
        String my_string = "Hello World";
        int[] counts = solution(my_string);
        
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('A' + i) + ": " + counts[i]);
        }
        
        for (int i = 26; i < 52; i++) {
            System.out.println((char)('a' + i - 26) + ": " + counts[i]);
        }
    }
}


    
