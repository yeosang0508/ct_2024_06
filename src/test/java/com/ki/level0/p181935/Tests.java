package com.ki.level0.p181935;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("7 => 16")
    void t1() {assertThat(new Solution().solution(7)).isEqualTo(16);}


     @Test
    @DisplayName("10 => 220")
    void t2() {assertThat(new Solution().solution(10)).isEqualTo(220);}



}
