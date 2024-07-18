package com.ki.level0.p120825;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("hello, 3 => hhheeellllllooo")
    void t1(){assertThat(new Solution().solution("hello",3)).isEqualTo("hhheeellllllooo");}

}

