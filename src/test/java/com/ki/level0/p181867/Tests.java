package com.ki.level0.p181867;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("oxooxoxxox => [1,2,1,0,1,0]")
    void t1(){assertThat(new Solution().solution("oxooxoxxox")).isEqualTo(new int[]{1,2,1,0,1,0});}

    @Test
    @DisplayName("xabcxdefxghi => [0,3,3,3]")
    void t2(){assertThat(new Solution().solution("xabcxdefxghi")).isEqualTo(new int[]{0,3,3,3});}



}
