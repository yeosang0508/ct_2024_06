package com.ki.level0.p120895;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("hello,1,2 => hlelo")
    void t1(){assertThat(new Solution().solution("hello",1,2)).isEqualTo("hlelo");}

    @Test
    @DisplayName("I love you,3,6 => I l veoyou")
    void t2(){assertThat(new Solution().solution("I love you",3,6)).isEqualTo("I l veoyou");}

}
