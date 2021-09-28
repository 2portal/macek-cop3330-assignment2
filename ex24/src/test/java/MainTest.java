import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void isAnagram() {
        assertEquals(false, Main.isAnagram("cat", "dog"));
        assertEquals(true, Main.isAnagram("cat", "tac"));
        assertEquals(false, Main.isAnagram("cat", "tacc"));
    }
}