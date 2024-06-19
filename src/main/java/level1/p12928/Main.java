package level1.p12928;

public class Main {
}
class Solution {
    public int solution(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i * j == n){
                    sum += i;
                }
            }
        }
        return sum;
    }
}