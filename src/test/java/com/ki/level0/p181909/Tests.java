package com.ki.level0.p181909;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("banana => [\"a\", \"ana\", \"anana\", \"banana\", \"na\", \"nana\"]")
    void t1(){assertThat(new Solution().solution("banana")).isEqualTo(new String[]{"a", "ana", "anana", "banana", "na", "nana"});}

    @Test
    @DisplayName("programmers => [\"ammers\", \"ers\", \"grammers\", \"mers\", \"mmers\", \"ogrammers\", \"programmers\", \"rammers\", \"rogrammers\", \"rs\", \"s\"]")
    void t2(){assertThat(new Solution().solution("programmers")).isEqualTo(new String[]{"ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"});}


}
