package com.ki.level0.p120812;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1,2,3,3,3,4] => 3")
    void t1() {assertThat(new Solution().solution(new int[]{1,2,3,3,3,4})).isEqualTo(3);}

}
