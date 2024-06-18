package com.ki.level0.p181888;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[4, 2, 6, 1, 7, 6], 2 => [4,6,7]")
    void t1() {assertThat(new Solution().solution(new int[]{4,2,6,1,7,6}, 2)).isEqualTo(new int[]{4,6,7});}



}
