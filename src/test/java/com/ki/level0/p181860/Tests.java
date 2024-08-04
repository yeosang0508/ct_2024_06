package com.ki.level0.p181860;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[3,2,4,1,3],[true,false,true, false, false] => [3,3,3,3,4,4,4,4]")
    void t1(){assertThat(new Solution().solution(new int[]{3,2,4,1,3}, new boolean[]{true,false,true, false, false})).isEqualTo(new int[]{3,3,3,3,4,4,4,4});}

}
