package level1.p12930;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("try hello world => TrY HeLlO WoRlD")
    void t1() {assertThat(new Solution().solution("try hello world")).isEqualTo("TrY HeLlO WoRlD");}

}
