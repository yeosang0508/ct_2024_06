package com.ki.level0.p181895;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1, 2, 3, 4, 5], [[1, 3], [0, 4]] => [2, 3, 4, 1, 2, 3, 4, 5]")
    void t1(){assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1,3},{0,4}})).isEqualTo(new int[]{2, 3, 4, 1, 2, 3, 4, 5});}

}
