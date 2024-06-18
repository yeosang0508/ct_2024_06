package com.ki.level0.p181933;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("-4, 7, true => 3")
    void t1() {assertThat(new Solution().solution(-4,7,true)).isEqualTo(3);}

     @Test
    @DisplayName("-4, 7,false => -11")
    void t2() {assertThat(new Solution().solution(-4,7,false)).isEqualTo(-11);}



}
