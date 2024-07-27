package com.ki.level0.p181919;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("10 => [10, 5, 16, 8, 4, 2, 1]")
    void t1(){assertThat(new Solution().solution(10)).isEqualTo(new int[]{10,5,16,8,4,2,1});}
}
