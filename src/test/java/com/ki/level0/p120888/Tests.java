package com.ki.level0.p120888;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("people => peol")
    void t1(){assertThat(new Solution().solution("people")).isEqualTo("peol");}

    @Test
    @DisplayName("We are the world => We arthwold")
    void t2(){assertThat(new Solution().solution("We are the world")).isEqualTo("We arthwold");}


}
