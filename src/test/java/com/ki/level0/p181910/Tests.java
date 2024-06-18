package com.ki.level0.p181910;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("ProgrammerS123, 11 => grammerS123")
    void t1() {assertThat(new Solution().solution("ProgrammerS123", 11)).isEqualTo("grammerS123");}


    @Test
    @DisplayName("He110W0r1d, 5 => W0r1d")
    void t2() {assertThat(new Solution().solution("He110W0r1d", 5)).isEqualTo("W0r1d");}


}
