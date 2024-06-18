package com.ki.level0.p181873;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("programmers, p => Programmers")
    void t1() {assertThat(new Solution().solution("programmers","p")).isEqualTo("Programmers");}


    @Test
    @DisplayName("lowercase, x => lowercase")
    void t2() {assertThat(new Solution().solution("lowercase","x")).isEqualTo("lowercase");}



}
