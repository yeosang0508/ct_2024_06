package com.ki.level0.p181843;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("banana, ana => 1")
    void t1() {assertThat(new Solution().solution("banana","ana")).isEqualTo(1);}


     @Test
    @DisplayName("banana, wxyz => 0")
    void t2() {assertThat(new Solution().solution("banana","wxyz")).isEqualTo(0);}



}
