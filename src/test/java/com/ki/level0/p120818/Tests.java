package com.ki.level0.p120818;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("price 150000일 때 5%할인 된 결과값인 142500이 나와야함")
    void t1() {
        assertThat(new Solution().solution(150000)).isEqualTo(142500);
    }

    @Test
    @DisplayName("price 580000일 때 20%할인된 결과값인 464000이 나와야 함")
    void t2() {
        assertThat(new Solution().solution(580000)).isEqualTo(464000);
    }

    @Test
    @DisplayName("price 350000일 때 10%할인된 결과값인 315000이 나와야 함")
    void t3() {
        assertThat(new Solution().solution(350000)).isEqualTo(315000);
    }

    @Test
    @DisplayName("price 50000일 때 할인되지 않은 결과값인 50000이 나와야 함")
    void t4() {
        assertThat(new Solution().solution(50000)).isEqualTo(50000);
    }

    @Test
    @DisplayName("price 1000000일 때 할인되지 않은 결과값인 800000이 나와야 함")
    void t5() {
        assertThat(new Solution().solution(1000000)).isEqualTo(800000);
    }

    @Test
    @DisplayName("price 950일 때 할인되지 않은 결과값인 950이 나와야 함")
    void t6() {
        assertThat(new Solution().solution(950)).isEqualTo(950);
    }


}

