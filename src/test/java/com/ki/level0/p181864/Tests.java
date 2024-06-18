package com.ki.level0.p181864;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("ABBAA, AABB => 1")
    void t1(){assertThat(new Solution().solution("ABBAA","AABB")).isEqualTo(1);}

    @Test
    @DisplayName("ABAB, ABAB => 0")
    void t2(){assertThat(new Solution().solution("ABAB","ABAB")).isEqualTo(0);}


}
