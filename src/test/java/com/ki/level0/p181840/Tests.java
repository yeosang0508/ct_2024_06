package com.ki.level0.p181840;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1,2,3,4,5], 3 => 1")
    void t1() {assertThat(new Solution().solution(new int[]{1,2,3,4,5},3)).isEqualTo(1);}

    @Test
    @DisplayName("[15,98,23,2,15], 3 => 20")
    void t2() {assertThat(new Solution().solution(new int[]{15,98,23,2,15},20)).isEqualTo(0);}



}
