package com.ki.level0.p181885;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[problemsolving, practiceguitar,swim,studygraph], [true,false,true,false] => [practiceguitar, studygraph]")
    void t1() {assertThat(new Solution().solution(new String[]{"problemsolving","practiceguitar","swim","studygraph"},new boolean[]{true,false,true,false})).isEqualTo(new String[]{"practiceguitar","studygraph"});}

}
