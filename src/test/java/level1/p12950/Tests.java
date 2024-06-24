package level1.p12950;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[[1,2],[2,3]], [[3,4],[5,6]] => [[4,6],[7,9]]")
    void t1() {assertThat(new Solution().solution(new int[][] {{1,2},{2,3}}, new int[][]{{3,4},{5,6}})).isEqualTo(new int[][]{{4,6},{7,9}});}

    @Test
    @DisplayName("[[1],[2]], [[3],[4]] => [[4],[6]]")
    void t2() {assertThat(new Solution().solution(new int[][] {{1},{2}}, new int[][]{{3},{4}})).isEqualTo(new int[][]{{4},{6}});}



}
