package com.ki.level0.p181941;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[a,b,c] => abc")
    void t1(){assertThat(new Solution().solution(new String[]{"a","b","c"})).isEqualTo("abc");}


}
