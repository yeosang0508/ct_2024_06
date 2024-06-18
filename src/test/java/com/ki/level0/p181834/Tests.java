package com.ki.level0.p181834;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("abcdevwxyz => lllllvwxyz")
    void t1(){assertThat(new Solution().solution("abcdevwxyz")).isEqualTo("lllllvwxyz");}


    @Test
    @DisplayName("jjnnllkkmm => llnnllllmm")
    void t2(){assertThat(new Solution().solution("jjnnllkkmm")).isEqualTo("llnnllllmm");}



}
