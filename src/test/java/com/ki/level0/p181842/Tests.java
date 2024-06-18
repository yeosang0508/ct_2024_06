package com.ki.level0.p181842;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("abc, aabcc => 1")
    void t1() {assertThat(new Solution().solution("abc", "aabcc")).isEqualTo(1);}

    @Test
    @DisplayName("tbt, tbbttb => 0")
    void t2() {assertThat(new Solution().solution("tbt", "tbbttb")).isEqualTo(0);}


}
