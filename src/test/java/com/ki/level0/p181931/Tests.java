package com.ki.level0.p181931;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("3, 4, [true, false, false, true, true]=> 37")
    void t1(){assertThat(new Solution().solution(3,4, new boolean[]{true, false, false, true, true})).isEqualTo(37);}

    @Test
    @DisplayName("7, 1, [false, false, false, true, false, false, false]=> 10")
    void t2(){assertThat(new Solution().solution(7,1, new boolean[]{false, false, false, true, false, false, false})).isEqualTo(10);}


}
