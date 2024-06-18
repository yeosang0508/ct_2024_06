package com.ki.level0.p181835;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1,2,3,100,99,98], 3 => [3,6,9,300,297,294]")
    void t1() {assertThat(new Solution().solution(new int[]{1,2,3,100,99,98}, 3)).isEqualTo(new int[] {3,6,9,300,297,294});}

    @Test
    @DisplayName("[1,2,3,100,99,98], 2 => [3,4,5,102,101,100]")
    void t2() {assertThat(new Solution().solution(new int[]{1,2,3,100,99,98}, 2)).isEqualTo(new int[] {3,4,5,102,101,100});}


}
