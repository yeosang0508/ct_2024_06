package level1.p77884;

public class Main {
    public static void main(String[] args) {
        int left = 1;
        int right = 4;

        int answer = 0;
        int odd = 0;
        int even = 0;


        for(int i = left; i <= right ; i++){

            int count = 2;

            for(int j = 2; j <= left -1; j++){
                if(i % j == 0){
                    count ++;
                }
            }
            if(count % 2 == 0){
                even += i;
            }else if(count % 2 == 1){
                odd += i;
            }
        }

        answer = even - odd;

        System.out.println(answer);
    }
}

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right ; i++){

            int count = 1;

            for(int j = 1; j <= i / 2; j++){
                if(i % j == 0){
                    count ++;
                }
            }

            if(count % 2 == 0){
                answer += i;
            }else if(count % 2 == 1){
                answer -= i;
            }
        }

        return answer;
    }
}