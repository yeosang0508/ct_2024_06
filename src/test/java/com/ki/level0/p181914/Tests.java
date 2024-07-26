package com.ki.level0.p181914;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("123 => 6")
    void t1(){assertThat(new Solution().solution("123")).isEqualTo(6);}

    @Test
    @DisplayName("78720646226947352489 => 2")
    void t2(){assertThat(new Solution().solution("78720646226947352489")).isEqualTo(2);}


}
