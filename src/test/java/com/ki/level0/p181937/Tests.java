package com.ki.level0.p181937;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("98, 2 => 1")
    void t1() {assertThat(new Solution().solution(98,2)).isEqualTo(1);}

     @Test
    @DisplayName("34, 3 => 0")
    void t2() {assertThat(new Solution().solution(34,3)).isEqualTo(0);}


}
