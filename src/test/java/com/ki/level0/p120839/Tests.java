package com.ki.level0.p120839;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("가위를 뜻하는 rsp 2를 이기는 바위를 뜻하는 0이 result에 나오는지")
    void t1() {
        assertThat(new Solution().solution("2")).isEqualTo("0");
    }

    @Test
    @DisplayName("rsp 205를 이기는 052이 result에 나오는지")
    void t2() {
        assertThat(new Solution().solution("205")).isEqualTo("052");
    }


}
