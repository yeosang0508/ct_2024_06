package com.ki.level0.p181838;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[2021,12,28], [2021,12,29] => 1")
    void t1(){assertThat(new Solution().solution(new int[]{2021,12,28}, new int[]{2021,12,29})).isEqualTo(1);}

    @Test
    @DisplayName("[1024,10,24], [1024,10,24] => 0")
    void t2(){assertThat(new Solution().solution(new int[]{1024,10,24}, new int[]{1024,10,24})).isEqualTo(0);}


}
