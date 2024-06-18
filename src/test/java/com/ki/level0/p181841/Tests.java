package com.ki.level0.p181841;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[abc, def, ghi], ef => abcghi")
    void t1() {assertThat(new Solution().solution(new String[]{"abc","def","ghi"}, "ef")).isEqualTo("abcghi");}


    @Test
    @DisplayName("[abc, bbc, cbc], c => ")
    void t2() {assertThat(new Solution().solution(new String[]{"abc","bbc","cbc"}, "c")).isEqualTo("");}


}
