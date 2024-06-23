package level1.p12933;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("118372 => 873211")
    void t1() {assertThat(new Solution().solution(118372)).isEqualTo(873211);}
}
