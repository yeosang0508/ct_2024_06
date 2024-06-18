package com.ki.level0.p181876;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("aBcDeFg => abcdefg")
    void t1() {assertThat(new Solution().solution("aBcDeFg")).isEqualTo("abcdefg");}

    @Test
    @DisplayName("aaa => aaa")
    void t2() {assertThat(new Solution().solution("aaa")).isEqualTo("aaa");}


}
