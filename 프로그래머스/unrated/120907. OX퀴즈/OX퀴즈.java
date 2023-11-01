class Solution {
    public String[] solution(String[] quiz) {
          String[] result = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" "); // "X [연산자] Y = Z" 형태를 분리.
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[2]);
            int z = Integer.parseInt(parts[4]);
            char operator = parts[1].charAt(0);
            
            // 계산된 결과가 실제 결과와 같은지 비교.
            if (operator == '+' && (x + y == z)) {
                result[i] = "O";
            } else if (operator == '-' && (x - y == z)) {
                result[i] = "O";
            } else {
                result[i] = "X";
            }
        }
        
        return result;
    }
}