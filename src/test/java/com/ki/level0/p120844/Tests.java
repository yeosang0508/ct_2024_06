package com.ki.level0.p120844;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1,2,3], right => [3,1,2]")
    void t1(){assertThat(new Solution().solution(new int[]{1,2,3}, "right")).isEqualTo(new int[]{3,1,2});}

    @Test
    @DisplayName("[4, 455, 6, 4, -1, 45, 6], left => [3,1,2]")
    void t2(){assertThat(new Solution().solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")).isEqualTo(new int[]{455, 6, 4, -1, 45, 6, 4});}



}
