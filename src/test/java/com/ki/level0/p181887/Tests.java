package com.ki.level0.p181887;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[4,2,6,1,7,6] => 17")
    void t1() {assertThat(new Solution().solution(new int[]{4,2,6,1,7,6})).isEqualTo(17);}

    @Test
    @DisplayName("[-1,2,5,6,3] => 8")
    void t2() {assertThat(new Solution().solution(new int[]{-1,2,5,6,3})).isEqualTo(8);}



}
