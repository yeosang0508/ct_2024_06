package level1.p133499;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[\"aya\", \"yee\", \"u\", \"maa\"] => 1")
    void t1() {assertThat(new Solution().solution(new String[]{"aya", "yee", "u", "maa"})).isEqualTo(1);}

    @Test
    @DisplayName("[\"ayaye\", \"uuu\", \"yeye\", \"yemawoo\", \"ayaayaa\"]\t => 2")
    void t2() {assertThat(new Solution().solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"})).isEqualTo(2);}



}
