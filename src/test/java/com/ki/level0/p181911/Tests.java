package com.ki.level0.p181911;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[progressive, hamburger, hammer, ahocorasick], [[0,4],[1,2],[3,5],[7,7]] => programmers")
    void t1(){assertThat(new Solution().solution(new String[]{"progressive", "hamburger","hammer","ahocorasick"}, new int[][]{{0,4},{1,2},{3,5},{7,7}})).isEqualTo("programmers");}


}
