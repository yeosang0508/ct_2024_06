package com.ki.level0.p181853;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[12,4,15,46,38,1,14] => [1,4,12,14,15]")
    void t1(){assertThat(new Solution().solution(new int[]{12,4,15,46,38,1,14})).isEqualTo(new int[]{1,4,12,14,15});}


}
