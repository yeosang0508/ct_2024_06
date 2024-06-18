package com.ki.level0.p120809;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1,2,3,4,5] => [2,4,6,8,10]")
    void t1() {assertThat(new Solution().solution(new int[]{1,2,3,4,5})).isEqualTo(new int[]{2,4,6,8,10});}
}
