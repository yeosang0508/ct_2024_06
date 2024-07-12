package com.ki.level0.p181874;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("abstract algebra => AbstrAct AlgebrA")
    void t1() {assertThat(new Solution().solution("abstract algebra")).isEqualTo("AbstrAct AlgebrA");}

    @Test
    @DisplayName("PrOgRaMmErS => progrAmmers")
    void t2() {assertThat(new Solution().solution("PrOgRaMmErS")).isEqualTo("progrAmmers");}



}
