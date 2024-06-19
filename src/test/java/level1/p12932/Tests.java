package level1.p12932;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("12345 => [5,4,3,2,1]")
    void t1() {assertThat(new Solution().solution(12345)).isEqualTo(new int[]{5,4,3,2,1});}
}
