package level1.p82612;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("3,20,4 => 10")
    void t1() {assertThat(new Solution().solution(3,20,4)).isEqualTo(10);}

}
