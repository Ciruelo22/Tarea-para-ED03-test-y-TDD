import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReOrdenarTest {

    @Test
    public void test_01() {
        int entrada = 42145;
        int salidaEsperada = 54421;
        assertEquals(salidaEsperada, ReOrdenar.ordenarDesc(entrada));
    }
    @Test
    public void test_02() {
        int entrada = 145263;
        int salidaEsperada = 654321;
        assertEquals(salidaEsperada, ReOrdenar.ordenarDesc(entrada));
    }
    @Test
    public void test_03() {
        int entrada = 123456789;
        int salidaEsperada = 987654321;
        assertEquals(salidaEsperada, ReOrdenar.ordenarDesc(entrada));
    }
}
