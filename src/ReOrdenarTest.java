import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReOrdenarTest {

    @Test
    public void test_01() {
        assertEquals(54421, ReOrdenar.ordenarDesc(42145));
    }
    @Test
    public void test_02() {
        assertEquals(654321, ReOrdenar.ordenarDesc(145263));
    }
    @Test
    public void test_03() {
        assertEquals(987654321, ReOrdenar.ordenarDesc(123456789));
    }

    @Test
    public void test_04() {
        assertEquals(0, ReOrdenar.ordenarDesc(0));
    }

    @Test
    public void test_05() {
        assertEquals(4, ReOrdenar.ordenarDesc(4));
    }

    @Test
    public void test_06() {
        assertEquals(9654310, ReOrdenar.ordenarDesc(9654310));
    }

    @Test
    public void test_07() {
        assertEquals(11110000, ReOrdenar.ordenarDesc(10101100));
    }

    @Test
    public void test_08() {
        assertEquals(01001011, ReOrdenar.ordenarDesc(01001011));
    }


}
