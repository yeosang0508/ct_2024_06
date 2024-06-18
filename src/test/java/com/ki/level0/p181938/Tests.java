package com.ki.level0.p181938;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("2, 91 => 364")
    void t1() {assertThat(new Solution().solution(2, 91)).isEqualTo(364);}

    @Test
    @DisplayName("91, 2 => 912")
    void t2() {assertThat(new Solution().solution(91,2)).isEqualTo(912);}


}
