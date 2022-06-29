import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.n2ex2.Main;

import java.util.Arrays;
import java.util.List;

public class OddEvenTest {

    @Test
    public void oddEvenTest() {

        List<Integer> llista = Arrays.asList(3, 55, 44);
        assertThat(Main.checkOddEven(llista)).isEqualTo("o3, o55, e44");

    }

}
