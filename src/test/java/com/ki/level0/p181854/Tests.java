package com.ki.level0.p181854;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[49,12,100,276,33], 27 => [76,12,127,276,60]")
    void t1() {assertThat(new Solution().solution(new int[]{49,12,100,276,33}, 27)).isEqualTo(new int[]{76,12,127,276,60});}


    @Test
    @DisplayName("[444,555,666,777], 100 => [444,655,666,877]")
    void t2() {assertThat(new Solution().solution(new int[]{444,555,666,777}, 100)).isEqualTo(new int[]{444,655,666,877});}



}
