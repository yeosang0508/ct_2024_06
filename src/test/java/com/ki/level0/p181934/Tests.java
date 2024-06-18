package com.ki.level0.p181934;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("<, =, 20, 50 => 1")
    void t1() {
        assertThat(new Solution().solution("<", "=", 20, 50)).isEqualTo(1);
    }

    @Test
    @DisplayName(">, !, 41, 78 => 0")
    void t2() {
        assertThat(new Solution().solution(">", "!", 41,78)).isEqualTo(0);
    }


}
