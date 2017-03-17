import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class JavaJupiterTests {

  @Test
  void helloJupiter() {
    assertTrue(true);
  }

  @Test
  @DisplayName("Hello Jupiter!")
  void helloNamedJupiter() {
    fail("Test");
  }
}
