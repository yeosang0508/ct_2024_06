package level1.p12916;

public class Main {


}

class Solution {
    boolean solution(String s) {

        s = s.toLowerCase();
        String[] str = s.split("");

        int p = 0;
        int y = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("p")) {
                p++;
            }
        }

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("y")) {
                y++;
            }
        }


        if (p == y) {
            return true;
        } else {
            return false;
        }
    }
}