package level1.p161989;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("8, 4, [2,3,6] => 2")
    void t1(){assertThat(new Solution().solution(8,4,new int[]{2,3,6})).isEqualTo(2);}

    @Test
    @DisplayName("5, 4, [1,3] => 1")
    void t2(){assertThat(new Solution().solution(5,4,new int[]{1,3})).isEqualTo(1);}

    @Test
    @DisplayName("4, 1, [1,2,3,4] => 4")
    void t3(){assertThat(new Solution().solution(4,1,new int[]{1,2,3,4})).isEqualTo(4);}


}
