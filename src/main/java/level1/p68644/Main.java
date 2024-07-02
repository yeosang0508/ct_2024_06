package level1.p68644;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
}

class Solution {
    public int[] solution(int[] numbers) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                list.add(sum);
            }
        }

        List<Integer> res = list.stream().distinct().collect(Collectors.toList());

        int[] result = new int[res.size()];

        for(int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        Arrays.sort(result);

        return result;
    }
}