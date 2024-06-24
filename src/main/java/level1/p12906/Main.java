package level1.p12906;
import java.util.*;

public class Main {
}


class Solution {
    public int[] solution(int[] arr) {
        // list 생성
        List<Integer> list = new ArrayList<>();
        // arr의 첫 번째 요소 담기
        list.add(arr[0]);

        // arr 순회
        for (int i = 1; i < arr.length; i++) {
            // arr의 현재 값이 직전 값과 같으면 무시
            if (arr[i - 1] == arr[i]) {
                continue;
            } else { // 다를 경우 list에 추가
                list.add(arr[i]);
            }
        }

        // list to array
        return list.stream().mapToInt(i -> i).toArray();
    }
}
//class Solution {
//    public int[] solution(int []arr) {
//
//        Stack<Integer> stack = new Stack<>();
//
//        for(int i : arr){
//
//            if(stack.empty() || stack.peek().equals(i)){
//                stack.push(i);
//            }
//        }
//
//        return stack.stream().mapToInt(i->i).toArray();
//    }
//}