package com.ki.level0.p181875;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[AAA,BBB,CCC,DDD] => [aaa, BBB, ccc,DDD]")
    void t1(){assertThat(new Solution().solution(new String[]{"AAA","BBB","CCC","DDD"})).isEqualTo(new String[]{"aaa","BBB","ccc","DDD"});}

    @Test
    @DisplayName("[aBc, AbC] => [abc, ABC]")
    void t2(){assertThat(new Solution().solution(new String[]{"aBc", "AbC"})).isEqualTo(new String[]{"abc","ABC"});}


}
