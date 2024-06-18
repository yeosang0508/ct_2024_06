package com.ki.level0.p181844;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[293, 1000, 395, 678, 94], [94, 777, 104, 1000, 1, 12] => [293, 395, 678]")
    void t1(){assertThat(new Solution().solution(new int[]{293, 1000, 395, 678, 94},new int[]{94, 777, 104, 1000, 1, 12})).isEqualTo(new int[]{293, 395, 678});}


    @Test
    @DisplayName("[110, 66, 439, 785, 1], [377, 823, 119, 43] => [110, 66, 439, 785, 1]")
    void t2(){assertThat(new Solution().solution(new int[]{110,66,439,785,1},new int[]{377, 823, 119, 43})).isEqualTo(new int[]{110, 66, 439, 785, 1});}



}
