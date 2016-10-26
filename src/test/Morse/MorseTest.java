package Morse;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class MorseTest {
       
    @Test
    public void encode() {
        String expected = ".- -... -.-. -.. . ..-. --. ... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. .---- ..--- ...-- ....- ..... -.... --... ---.. ----. -----";
        String actual = Morse.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
        
        assertEquals(expected, actual);
    }
    
}
