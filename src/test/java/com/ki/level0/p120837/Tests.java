package com.ki.level0.p120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {


    @Test
    @DisplayName("사냥감의 체력이 23hp일 경우 개미의 최소 병력은 5")
    void t1() {
        assertThat(new Solution().solution(23)).isEqualTo(5);
    }

    @Test
    @DisplayName("사냥감의 체력이 24hp일 경우 개미의 최소 병력은 6")
    void t2() {
        assertThat(new Solution().solution(24)).isEqualTo(6);
    }

    @Test
    @DisplayName("사냥감의 체력이 999hp일 경우 개미의 최소 병력은 201")
    void t3() {
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }


}
