package com.ki.level0.p181833;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("3 => [[1, 0, 0], [0, 1, 0], [0, 0, 1]]")
    void t1(){assertThat(new Solution().solution(3)).isEqualTo(new int[][]{{1,0,0},{0,1,0},{0,0,1}});}

    @Test
    @DisplayName("6 => [[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]")
    void t2(){assertThat(new Solution().solution(6)).isEqualTo(new int[][]{{1, 0, 0, 0, 0, 0},{0, 1, 0, 0, 0, 0},{0, 0, 1, 0, 0, 0},{0, 0, 0, 1, 0, 0},{0, 0, 0, 0, 1, 0},{0, 0, 0, 0, 0, 1}});}

    @Test
    @DisplayName("1 => [[1]]")
    void t3(){assertThat(new Solution().solution(1)).isEqualTo(new int[][]{{1}});}


}
