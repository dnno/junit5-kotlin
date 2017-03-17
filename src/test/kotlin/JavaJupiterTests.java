import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaJupiterTests {

  @Test
  void helloJupiter() {
    assertTrue(true);
  }

  @Test
  @DisplayName("Hello Jupiter!")
  void helloNamedJupiter(){

  }
}
