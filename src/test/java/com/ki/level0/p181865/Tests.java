package com.ki.level0.p181865;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("43 + 12 => 55")
    void t1(){assertThat(new Solution().solution("43 + 12")).isEqualTo(55);}


    @Test
    @DisplayName("0 - 7777 => -7777")
    void t2(){assertThat(new Solution().solution("0 - 7777")).isEqualTo(-7777);}


    @Test
    @DisplayName("40000 * 40000 => 1600000000")
    void t3(){assertThat(new Solution().solution("40000 * 40000")).isEqualTo(1600000000);}



}
