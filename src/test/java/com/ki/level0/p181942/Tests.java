package com.ki.level0.p181942;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("aaaaa, bbbbb => ababababab")
    void t1(){assertThat(new Solution().solution("aaaaa","bbbbb")).isEqualTo("ababababab");}

}
