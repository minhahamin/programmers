import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String result = "";
		for(char b : a.toCharArray()) {
        
			if(Character.isLowerCase(b)) {
				result += Character.toUpperCase(b);  //대문자를 소문자로 변경
			} else {
				result += Character.toLowerCase(b);  //소문자를 대문자로 변경
			}
            
		}
		System.out.println(result);
	}
}