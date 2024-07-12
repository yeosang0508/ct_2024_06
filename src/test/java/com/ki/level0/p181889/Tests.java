package com.ki.level0.p181889;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[2,1,6], 1 => [2]")
    void t1() {assertThat(new Solution().solution(new int[]{2,1,6},1)).isEqualTo(new int[]{2});}

    @Test
    @DisplayName("[5, 2, 1, 7, 5], 3 => [5,2,1]")
    void t2() {assertThat(new Solution().solution(new int[]{5,2,1,7,5},3)).isEqualTo(new int[]{5,2,1});}



}
