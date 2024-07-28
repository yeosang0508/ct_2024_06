package com.ki.level0.p120815;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("6 => 1")
    void t1(){assertThat(new Solution().solution(6)).isEqualTo(1);}

    @Test
    @DisplayName("10 => 5")
    void t2(){assertThat(new Solution().solution(10)).isEqualTo(5);}

    @Test
    @DisplayName("4 => 2")
    void t3(){assertThat(new Solution().solution(4)).isEqualTo(2);}


}
