package com.ki.level0.p181892;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[2,1,6], 3 => [6]")
    void t1() {assertThat(new Solution().solution(new int[]{2,1,6},3)).isEqualTo(new int[]{6});}

    @Test
    @DisplayName("[5, 2, 1, 7, 5], 2 => [2,1,7,5]")
    void t2() {assertThat(new Solution().solution(new int[]{5,2,1,7,5},2)).isEqualTo(new int[]{2,1,7,5});}

}
