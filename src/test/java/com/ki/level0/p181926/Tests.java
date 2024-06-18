package com.ki.level0.p181926;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("0, wsdawsdassw => -1")
    void t1() {assertThat(new Solution().solution(0,"wsdawsdassw")).isEqualTo(-1);}


}
