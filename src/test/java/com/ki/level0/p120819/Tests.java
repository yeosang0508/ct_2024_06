package com.ki.level0.p120819;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("머쓱이가 5500원을 가지고 있을 경우 최대로 마실 수 있는 잔 수와 남은 돈 배열 [1, 0] 나와야 함")
    void t1(){assertThat(new Solution().solution(5500)).isEqualTo(new int[] {1, 0});}

    @Test
    @DisplayName("머쓱이가 15000원을 가지고 있을 경우 최대로 마실 수 있는 잔 수와 남은 돈 배열 [2, 4000] 나와야 함")
    void t2(){assertThat(new Solution().solution(15000)).isEqualTo(new int[] {2, 4000});}


}
