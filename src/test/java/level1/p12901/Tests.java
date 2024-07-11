package level1.p12901;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {


    @Test
    @DisplayName("5, 24 => TUE")
    void t1() {assertThat(new Solution().solution(5,24)).isEqualTo("TUE");}

}
