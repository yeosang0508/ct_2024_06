package level1.p42862;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("5, [2, 4], [1,3,5] => 5")
    void t1(){assertThat(new Solution().solution(5, new int[]{2,4},new int[]{1,3,5})).isEqualTo(5);}


    @Test
    @DisplayName("5, [2, 4], [3] => 4")
    void t2(){assertThat(new Solution().solution(5, new int[]{2,4},new int[]{1,3,5})).isEqualTo(5);}


    @Test
    @DisplayName("3, [3], [1] => 2")
    void t3(){assertThat(new Solution().solution(3, new int[]{3},new int[]{1})).isEqualTo(2);}


    @Test
    @DisplayName("30, [4, 16, 19], [5,15,17,29] => 29")
    void t4(){assertThat(new Solution().solution(30, new int[]{4, 16, 19},new int[]{5,15,17,29})).isEqualTo(29);}




}
