package com.ki.level0.p181936;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("60, 2, 3 => 1")
    void t1() {
        assertThat(new Solution().solution(60, 2, 3)).isEqualTo(1);
    }

    @Test
    @DisplayName("55, 10, 5 => 0")
    void t2() {
        assertThat(new Solution().solution(55, 10 ,5)).isEqualTo(0);
    }


}
