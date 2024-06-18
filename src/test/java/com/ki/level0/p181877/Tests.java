package com.ki.level0.p181877;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("aBcDeFg => ABCDEFG")
    void t1() {assertThat(new Solution().solution("aBcDeFg")).isEqualTo("ABCDEFG");}


    @Test
    @DisplayName("AAA => AAA")
    void t2() {assertThat(new Solution().solution("AAA")).isEqualTo("AAA");}



}
