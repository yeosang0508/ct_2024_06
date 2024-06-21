package level1.p86051;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1,2,3,4,6,7,8,0] => 14")
    void t1() {assertThat(new Solution().solution(new int[]{1,2,3,4,6,7,8,0})).isEqualTo(14);}
}
