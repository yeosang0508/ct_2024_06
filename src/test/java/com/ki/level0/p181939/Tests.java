package com.ki.level0.p181939;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("9, 91 => 991")
    void t1() {assertThat(new Solution().solution(9,91)).isEqualTo(991);}


    @Test
    @DisplayName("89, 8 => 898")
    void t2() {assertThat(new Solution().solution(89, 8)).isEqualTo(898);}



}
