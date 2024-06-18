package com.ki.level0.p181943;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("He11oWor1d, lloWorl,2 => HelloWorld")
    void t1() {assertThat(new Solution().solution("He11oWor1d","lloWorl",2)).isEqualTo("HelloWorld");}

    @Test
    @DisplayName("Program29b8UYP, merS123, 7 => ProgrammerS123")
    void t2() {assertThat(new Solution().solution("Program29b8UYP","merS123",7)).isEqualTo("ProgrammerS123");}


}
