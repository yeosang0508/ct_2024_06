package com.ki.level0.p181879;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[3,4,5,2,5,4,6,7,3,7,2,2,1] => 51")
    void t1() {assertThat(new Solution().solution(new int[] {3,4,5,2,5,4,6,7,3,7,2,2,1})).isEqualTo(51);}


    @Test
    @DisplayName("[2,3,4,5] => 120")
    void t2() {assertThat(new Solution().solution(new int[] {2,3,4,5})).isEqualTo(120);}



}
