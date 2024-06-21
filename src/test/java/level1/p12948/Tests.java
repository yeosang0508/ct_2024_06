package level1.p12948;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("01033334444 => *******4444")
    void t1() {assertThat(new Solution().solution("01033334444")).isEqualTo("*******4444");}

    @Test
    @DisplayName("027778888 => *****8888")
    void t2() {assertThat(new Solution().solution("027778888")).isEqualTo("*****8888");}


}
