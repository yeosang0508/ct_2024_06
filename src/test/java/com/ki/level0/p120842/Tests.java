package com.ki.level0.p120842;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1, 2, 3, 4, 5, 6, 7, 8], 2 => [[1, 2], [3, 4], [5, 6], [7, 8]]")
    void t1(){assertThat(new Solution().solution(new int[]{1,2,3,4,5,6,7,8}, 2)).isEqualTo(new int[][]{{1,2},{3,4},{5,6},{7,8}});}

    @Test
    @DisplayName("[100, 95, 2, 4, 5, 6, 18, 33, 948], 3 => [[100, 95, 2], [4, 5, 6], [18, 33, 948]]")
    void t2(){assertThat(new Solution().solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)).isEqualTo(new int[][]{{100, 95, 2},{4, 5, 6},{18, 33, 948}});}


}
