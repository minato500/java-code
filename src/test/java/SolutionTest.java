import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test1() {
        assertEquals(5, Solution.add(2, 3));
    }

    @Test
    void test2() {
        assertEquals(10, Solution.add(7, 3));
    }

    @Test
    void test3() {
        assertEquals(0, Solution.add(0, 0));
    }

    @Test
    void test4() {
        assertEquals(-5, Solution.add(-2, -3));
    }

    @Test
    void test5() {
        assertEquals(1, Solution.add(-2, 3));
    }

    @Test
    void test6() {
        assertEquals(100, Solution.add(50, 50));
    }

    @Test
    void test7() {
        assertEquals(1000, Solution.add(600, 400));
    }

    @Test
    void test8() {
        assertEquals(-1, Solution.add(-5, 4));
    }

    @Test
    void test9() {
        assertEquals(15, Solution.add(10, 5));
    }

    @Test
    void test10() {
        assertEquals(200, Solution.add(150, 50));
    }
}