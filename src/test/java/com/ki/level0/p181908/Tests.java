package com.ki.level0.p181908;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("banana, ana => 1")
    void t1() {assertThat(new Solution().solution("banana","ana")).isEqualTo(1);}

     @Test
    @DisplayName("banana, nan => 0")
    void t2() {assertThat(new Solution().solution("banana","nan")).isEqualTo(0);}

     @Test
    @DisplayName("banana, wxyz => 0")
    void t3() {assertThat(new Solution().solution("banana","wxyz")).isEqualTo(0);}

     @Test
    @DisplayName("banana, abanana => 0")
    void t4() {assertThat(new Solution().solution("banana","abanana")).isEqualTo(0);}


}
