package level1.p12903;

public class Main {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i / 2);
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] strings = s.split("");

        int a = strings.length;

        if(strings.length % 2 == 0) {
            answer += strings[(a / 2) - 1];
            answer += strings[(a / 2)];
        }else {
            answer += strings[(a / 2)];
        }
        return answer;
    }
}