import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomansTest {

    Romans roman;

    @BeforeEach
    void startUp() {
        roman = new Romans();
    }

    @Test
    void shouldReturnI() {
        assertEquals("I", roman.toRomans(1));
    }

    @Test
    void shouldReturnII(){
        assertEquals("II", roman.toRomans(2));
    }

    @Test
    void shouldReturnIII(){
        assertEquals("III", roman.toRomans(3));
    }

    @Test
    void shouldReturnIV() {
        assertEquals("IV", roman.toRomans(4));
    }

    @Test
    void shouldReturnV(){
        assertEquals("V", roman.toRomans(5));
    }


}
