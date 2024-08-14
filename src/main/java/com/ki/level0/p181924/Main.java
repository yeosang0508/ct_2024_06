package com.ki.level0.p181924;

public class Main {
}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) { // 향상된 for문을 사용하여 쿼리를 가져온다.
            int i = query[0];
            int j = query[1]; //index값 지정

            int x = arr[i];
            arr[i] = arr[j];
            arr[j] = x;	// arr의 원소값 바꾸기
        }

        return arr;
    }
}