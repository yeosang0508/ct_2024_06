package level1.p12932;

public class Main {
}
class Solution {
    public int[] solution(long n) {

        String str = String.valueOf(n);
        String[] strs = str.split("");

        int[] answer = new int[strs.length];
        int a = strs.length;

        for(int i = 0; i < strs.length; i++){
            answer[i] = Integer.parseInt(strs[--a]);

        }
        return answer;
    }
}