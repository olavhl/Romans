import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomansTest {

    @Test
    void shouldReturnI() {
        Romans roman = new Romans();
        assertEquals("I", roman.toRomans(1));
    }

    @Test
    void shouldReturnII(){
        Romans roman = new Romans();
        assertEquals("II", roman.toRomans(2));
    }

    @Test
    void shouldReturnIII(){
        Romans roman = new Romans();
        assertEquals("III", roman.toRomans(3));
    }
}
