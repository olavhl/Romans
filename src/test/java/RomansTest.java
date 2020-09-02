import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomansTest {

    @Test
    void shouldReturnI() {
        Romans roman = new Romans();
        assertEquals("I", roman.toRomans(1));
    }
}
