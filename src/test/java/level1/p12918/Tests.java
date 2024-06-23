package level1.p12918;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("a234 => false")
    void t1() {assertThat(new Solution().solution("a234")).isEqualTo(false);}

    @Test
    @DisplayName("1234 => true")
    void t2() {assertThat(new Solution().solution("1234")).isEqualTo(true);}


}
