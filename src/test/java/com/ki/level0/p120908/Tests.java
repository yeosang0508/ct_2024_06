package com.ki.level0.p120908;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("ab6CDE443fgh22iJKlmn1o, 6CD => 1")
    void t1(){assertThat(new Solution().solution("ab6CDE443fgh22iJKlmn1o", "6CD")).isEqualTo(1);}

    @Test
    @DisplayName("ppprrrogrammers, pppp => 2")
    void t2(){assertThat(new Solution().solution("ppprrrogrammers", "pppp")).isEqualTo(2);}

    @Test
    @DisplayName("AbcAbcA, AAA => 2")
    void t3(){assertThat(new Solution().solution("AbcAbcA", "AAA")).isEqualTo(2);}


}
