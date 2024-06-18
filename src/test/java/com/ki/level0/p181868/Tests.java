package com.ki.level0.p181868;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("i love you => [i, love, you]")
    void t1() {assertThat(new Solution().solution("i love you")).isEqualTo(new String[]{"i","love","you"});}

    @Test
    @DisplayName("  programmers => [programmers]")
    void t2() {assertThat(new Solution().solution("  programmers ")).isEqualTo(new String[]{"programmers"});}



}
