package com.ki.level0.p181898;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[0, 0, 0, 1], 1 => 3")
    void t1(){assertThat(new Solution().solution(new int[]{0,0,0,1},1)).isEqualTo(3);}

    @Test
    @DisplayName("[1,0,0,1,0,0], 4 => -1")
    void t2(){assertThat(new Solution().solution(new int[]{1,0,0,1,0,0},4)).isEqualTo(-1);}

    @Test
    @DisplayName("[1,1,1,1,0], 3 => 3")
    void t3(){assertThat(new Solution().solution(new int[]{1,1,1,1,0},3)).isEqualTo(3);}


}
