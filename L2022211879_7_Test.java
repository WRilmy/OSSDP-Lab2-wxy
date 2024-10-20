import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class L2022211879_7_Test {

    @Test
    void smallestStringWithSwaps() {
        List<List<Integer>> pairs = List.of(List.of(0, 3), List.of(1, 2));
        Solution7 solution7 = new Solution7();
        assertEquals("bacd", solution7.smallestStringWithSwaps("dcab", pairs));
        pairs = List.of(List.of(0, 3), List.of(0, 2), List.of(1, 2));
        assertEquals("abcd", solution7.smallestStringWithSwaps("dcab", pairs));
        pairs = List.of(List.of(0, 1), List.of(1, 2));
        assertEquals("abc", solution7.smallestStringWithSwaps("cba", pairs));
    }
    //可以新增更多的测试函数，以增强测试的可靠性。
    //可以测试更多的特殊情况，如边界值等，单靠一个测试函数不符合测试用例设计的原则
}
