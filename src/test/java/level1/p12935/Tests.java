package level1.p12935;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[4,3,2,1] => [4,3,2]")
    void t1() {assertThat(new Solution().solution(new int[]{4,3,2,1})).isEqualTo(new int[]{4,3,2});}

    @Test
    @DisplayName("[10] => [-1]")
    void t2() {assertThat(new Solution().solution(new int[]{10})).isEqualTo(new int[]{-1});}


}
