package com.ki.level0.p181927;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[2,1,6] => [2,1,6,5]")
    void t1() {assertThat(new Solution().solution(new int[]{2,1,6})).isEqualTo(new int[]{2,1,6,5});}


     @Test
    @DisplayName("[5, 2, 1, 7, 5] => [5, 2, 1, 7, 5, 10]")
    void t2() {assertThat(new Solution().solution(new int[]{5,2,1,7,5})).isEqualTo(new int[]{5,2,1,7,5,10});}



}
