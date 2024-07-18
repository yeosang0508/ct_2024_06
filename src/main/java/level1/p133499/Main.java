package level1.p133499;

public class Main {
}

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] words = {"aya", "ye", "woo", "ma"};
        String[] mix = new String[16];

        for (int i = 0; i < words.length; i++) {
            mix[i] = words[i];
        }

        int count = 4;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    continue;
                }
                mix[count++] = words[i] + words[j];
            }
        }



        for (int i = 0; i < babbling.length; i++) {
            for (int k = 0; k < mix.length; k++) {

                if (mix[k].equals(babbling[i])){
                    answer++;
                }
            }
        }
        return answer;
    }
}