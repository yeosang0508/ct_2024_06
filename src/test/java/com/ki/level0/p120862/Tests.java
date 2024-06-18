package com.ki.level0.p120862;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1,2,-3,4,-5] => 15")
    void t1() {assertThat(new Solution().solution(new int[]{1,2,-3,4,-5})).isEqualTo(15);}

    @Test
    @DisplayName("[0,-31,24,10,1,9] => 240")
    void t2() {assertThat(new Solution().solution(new int[]{0,-31,24,10,1,9})).isEqualTo(240);}


    @Test
    @DisplayName("[10,20,30,5,5,20,5] => 600")
    void t3() {assertThat(new Solution().solution(new int[]{10,20,30,5,5,20,5})).isEqualTo(600);}



}
