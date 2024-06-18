package com.ki.level0.p181870;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[and, notad, abcd] => [and, abcd]")
    void t1() {assertThat(new Solution().solution(new String[]{"and","notad","abcd"})).isEqualTo(new String[]{"and","abcd"});}


    @Test
    @DisplayName("[there, are, no, a, ds] => [there, are, no, a, ds]")
    void t2() {assertThat(new Solution().solution(new String[]{"there","are","no","a","ds"})).isEqualTo(new String[]{"there","are","no","a","ds"});}




}
