package level1.p12922;

public class Main {

}

class Solution {
    public String solution(int n) {
        String answer = "";

        for(int i = 0; i <= n ;){

            answer += "수";
            i++;
            if(n == i){
                break;
            }

            answer += "박";
            i++;
            if(n == i){
                break;
            }
        }
        return answer;
    }
}