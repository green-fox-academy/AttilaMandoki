import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharsTest {
  UniqueChars testExample = new UniqueChars();

  @Test
  void correctResult() throws Exception {
    assertEquals(testExample.uniqueCharacters("anagramcc"), "[n, g, r, m]");

  }

  @Test
  void emptyList() throws Exception {
   assertEquals(testExample.uniqueCharacters(""), "[]");
  }

  @Test
  void noUniqueLetters() throws Exception {

  }
}