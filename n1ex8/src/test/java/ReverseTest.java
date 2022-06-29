import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.n1ex8.ReverseInterface;

public class ReverseTest {

    @Test
    public void reverseTest() {

        ReverseInterface reverseInterface = string -> new StringBuilder(string).reverse().toString();
        assertThat(reverseInterface.reverse("Ernest")).isEqualTo("tsenrE");

    }

}
