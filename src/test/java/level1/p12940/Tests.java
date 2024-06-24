package level1.p12940;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("3,12 => [3,12]")
    void t1() {assertThat(new Solution().solution(3,12)).isEqualTo(new int[]{3,12});}

    @Test
    @DisplayName("2,5 => [1,10]")
    void t2() {assertThat(new Solution().solution(2,5)).isEqualTo(new int[]{1,10});}


}
