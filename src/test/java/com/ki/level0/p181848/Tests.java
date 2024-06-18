package com.ki.level0.p181848;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("10 => 10")
    void t1() {assertThat(new Solution().solution("10")).isEqualTo(10);}


     @Test
    @DisplayName("8542 => 8542")
    void t2() {assertThat(new Solution().solution("8542")).isEqualTo(8542);}



}
