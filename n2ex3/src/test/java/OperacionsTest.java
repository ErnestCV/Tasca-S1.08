import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.n2ex3.Operador;

public class OperacionsTest {

    @Test
    public void sumaTest() {
        Operador operadorSuma = (n1, n2) -> n1 + n2;
        assertThat(operadorSuma.operacio(-4f, 9.3f)).isEqualTo(5.3f);
    }

    @Test
    public void restaTest() {
        Operador operadorSuma = (n1, n2) -> n1 - n2;
        assertThat(operadorSuma.operacio(-4f, 9.3f)).isEqualTo(-13.3f);
    }

    @Test
    public void multiplicacioTest() {
        Operador operadorSuma = (n1, n2) -> n1 * n2;
        assertThat(operadorSuma.operacio(-4f, 9.3f)).isEqualTo(-37.2f);
    }

    @Test
    public void divisioTest() {
        Operador operadorSuma = (n1, n2) -> n1 / n2;
        assertThat(operadorSuma.operacio(-4f, 9.3f)).isEqualTo(-0.4301075f);
    }

}
