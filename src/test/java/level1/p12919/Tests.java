package level1.p12919;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[Jane,Kim] => 김서방은 1에 있다")
    void t1() {assertThat(new Solution().solution(new String[]{"Jane","Kim"})).isEqualTo("김서방은 1에 있다");}
}
