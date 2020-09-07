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
    void shouldReturnII() {
        assertEquals("II", roman.toRomans(2));
    }

    @Test
    void shouldReturnIII() {
        assertEquals("III", roman.toRomans(3));
    }

    @Test
    void shouldReturnIV() {
        assertEquals("IV", roman.toRomans(4));
    }

    @Test
    void shouldReturnV() {
        assertEquals("V", roman.toRomans(5));
    }

    @Test
    void shouldReturnVII() {
        assertEquals("VII", roman.toRomans(7));
    }

    @Test
    void shouldReturnIX() {
        assertEquals("IX", roman.toRomans(9));
    }

    @Test
    void shouldReturnX() {
        assertEquals("X", roman.toRomans(10));
    }

    @Test
    void shouldReturnXIV() {
        assertEquals("XIV", roman.toRomans(14));
    }

    @Test
    void shouldReturnXV() {
        assertEquals("XV", roman.toRomans(15));
    }

    @Test
    void shouldReturnXVI() {
        assertEquals("XVI", roman.toRomans(16));
    }

    @Test
    void shouldReturnXXXVI() {
        assertEquals("XXXVI", roman.toRomans(36));
    }

    @Test
    void shouldReturnXL() {
        assertEquals("XL", roman.toRomans(40));
    }

    @Test
    void shouldReturnLII() {
        assertEquals("LII", roman.toRomans(52));
    }

    @Test
    void shouldReturnLXXII() {
        assertEquals("LXXII", roman.toRomans(72));
    }

    @Test
    void shouldReturnXCIX() {
        assertEquals("XCIX", roman.toRomans(99));
    }

    @Test
    void shouldReturnCCCXCIX() {
        assertEquals("CCCXCIX", roman.toRomans(399));
    }

    @Test
    void shouldReturnCDXCV() {
        assertEquals("CDXCV", roman.toRomans(495));
    }

    @Test
    void shouldReturnDXXI() {
        assertEquals("DXXI", roman.toRomans(521));
    }

    @Test
    void shouldReturnDCCIX() {
        assertEquals("DCCIX", roman.toRomans(709));
    }

    @Test
    void shouldReturnCMXCVIII() {
        assertEquals("CMXCVIII", roman.toRomans(998));
    }

    @Test
    void shouldReturnMCMXCVIII() {
        assertEquals("MCMXCVIII", roman.toRomans(1998));
    }

    @Test
    void shouldReturnMMDCXLII() {
        assertEquals("MMDCXLII", roman.toRomans(2642));
    }

    @Test
    void shouldReturnMCMXCIX() {
        assertEquals("MCMXCIX", roman.toRomans(1999));
    }

}
