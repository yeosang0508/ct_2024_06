package com.ki.level0.p120822;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("jaron => noraj")
    void t1() {assertThat(new Solution().solution("jaron")).isEqualTo("noraj");}


}
