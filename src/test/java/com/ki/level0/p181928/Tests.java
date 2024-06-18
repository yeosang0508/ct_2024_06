package com.ki.level0.p181928;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[3,4,5,2,1] => 393")
    void t1() {assertThat(new Solution().solution(new int[]{3,4,5,2,1})).isEqualTo(393);}

    @Test
    @DisplayName("[5,7,8,3] => 581")
    void t2() {assertThat(new Solution().solution(new int[]{5,7,8,3})).isEqualTo(581);}


}
