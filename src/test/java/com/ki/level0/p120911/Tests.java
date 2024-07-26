package com.ki.level0.p120911;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("Bcad => abcd")
    void t1() {assertThat(new Solution().solution("Bcad")).isEqualTo("abcd");}

    @Test
    @DisplayName("heLLo => ehllo")
    void t2() {assertThat(new Solution().solution("heLLo")).isEqualTo("ehllo");}

    @Test
    @DisplayName("Python => hnopty")
    void t3() {assertThat(new Solution().solution("Python")).isEqualTo("hnopty");}


}
