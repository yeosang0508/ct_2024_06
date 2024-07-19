package level1.p176963;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[\"may\", \"kein\", \"kain\", \"radi\"], [5, 10, 1, 3], [[\"may\", \"kein\", \"kain\", \"radi\"],[\"may\", \"kein\", \"brin\", \"deny\"], [\"kon\", \"kain\", \"may\", \"coni\"]] => [19, 15, 6]")
    void t1() {assertThat(new Solution().solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}})).isEqualTo(new int[]{19, 15, 6});}

    @Test
    @DisplayName("[\"kali\", \"mari\", \"don\"], [11, 1, 55], [[\"kali\", \"mari\", \"don\"], [\"pony\", \"tom\", \"teddy\"], [\"con\", \"mona\", \"don\"]] => [67,0,55]")
    void t2() {assertThat(new Solution().solution(new String[]{"kali", "mari", "don"}, new int[]{11, 1, 55}, new String[][]{{"kali", "mari", "don"},{"pony", "tom", "teddy"},{"con", "mona", "don"}})).isEqualTo(new int[]{67, 0, 55});}

    @Test
    @DisplayName("[\"may\", \"kein\", \"kain\", \"radi\"], [5, 10, 1, 3], [[\"may\"],[\"kein\", \"deny\", \"may\"], [\"kon\", \"coni\"]] => [5, 15, 0]")
    void t3() {assertThat(new Solution().solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may"},{"kein", "deny", "may"},{"kon", "coni"}})).isEqualTo(new int[]{5, 15, 0});}



}
