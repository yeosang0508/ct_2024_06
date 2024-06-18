package com.ki.level0.p181847;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("0010 => 10")
    void t1() {assertThat(new Solution().solution("0010")).isEqualTo("10");}

    @Test
    @DisplayName("854020 => 854020")
    void t2() {assertThat(new Solution().solution("854020")).isEqualTo("854020");}


}
