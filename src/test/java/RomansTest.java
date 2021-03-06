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
    void shouldReturnXIX() {
        assertEquals("XIX", roman.toRomans(19));
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
    void shouldReturnL() {
        assertEquals("L", roman.toRomans(50));
    }

    @Test
    void shouldReturnLIX() {
        assertEquals("LIX", roman.toRomans(59));
    }

    @Test
    void shouldReturnLXXII() {
        assertEquals("LXXII", roman.toRomans(72));
    }

    @Test
    void shouldReturnLXXXVII(){
        assertEquals("LXXXVII", roman.toRomans(87));
    }

    @Test
    void shouldReturnXC(){
        assertEquals("XC", roman.toRomans(90));
    }

    @Test
    void shouldReturnC(){
        assertEquals("C", roman.toRomans(100));
    }
}
