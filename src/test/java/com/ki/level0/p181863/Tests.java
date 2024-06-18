package com.ki.level0.p181863;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("masterpiece => rnasterpiece")
    void t1(){assertThat(new Solution().solution("masterpiece")).isEqualTo("rnasterpiece");}


    @Test
    @DisplayName("programmers => prograrnrners")
    void t2(){assertThat(new Solution().solution("programmers")).isEqualTo("prograrnrners");}


    @Test
    @DisplayName("jerry => jerry")
    void t3(){assertThat(new Solution().solution("jerry")).isEqualTo("jerry");}


    @Test
    @DisplayName("burn => burn")
    void t4(){assertThat(new Solution().solution("burn")).isEqualTo("burn");}



}
