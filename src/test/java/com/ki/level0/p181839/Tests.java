package com.ki.level0.p181839;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("3, 5 => 34")
    void t1() {
        assertThat(new Solution().solution(3, 5)).isEqualTo(34);
    }


    @Test
    @DisplayName("6, 1 => 14")
    void t2() {
        assertThat(new Solution().solution(6,1)).isEqualTo(14);
    }


    @Test
    @DisplayName("2, 4 => 2")
    void t3() {
        assertThat(new Solution().solution(2,4)).isEqualTo(2);
    }


}
