package com.ki.level0.p181845;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("123 => 123")
    void t1() {assertThat(new Solution().solution(123)).isEqualTo("123");}


     @Test
    @DisplayName("2573 => 2573")
    void t2() {assertThat(new Solution().solution(2573)).isEqualTo("2573");}



}
