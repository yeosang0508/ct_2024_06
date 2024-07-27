package com.ki.level0.p181925;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1] => wsdawsdassw")
    void t1(){assertThat(new Solution().solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1})).isEqualTo("wsdawsdassw");}

}
