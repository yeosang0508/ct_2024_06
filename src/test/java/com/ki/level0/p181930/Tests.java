package com.ki.level0.p181930;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("2,6,1 => 9")
    void t1(){assertThat(new Solution().solution(2,6,1)).isEqualTo(9);}


    @Test
    @DisplayName("5,3,3 => 473")
    void t2(){assertThat(new Solution().solution(5,3,3)).isEqualTo(473);}


    @Test
    @DisplayName("4,4,4 => 110592")
    void t3(){assertThat(new Solution().solution(4,4,4)).isEqualTo(110592);}



}
