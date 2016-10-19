package Morse;

import Morse.Dictionaries.PT;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Encoder {
    public static String encode(String str) {
        List letters = str
        .chars()
        .mapToObj(e->(char)e)
        .collect(Collectors.toList());
        
        return letters
        .stream()
        .reduce("", (prev, current) -> {
            return Arrays.stream(PT.values())
            .filter(code -> {
                String expected = current.toString();
                String actual = code.getKey().toString();
                
                return expected.equals(actual);
            })
            .findFirst()
            .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", current)))
            .getValue();
        })
        .toString();
    }
    
    public static void main(String[] args) {
        String expected = ".- -... -.-. -.. . ..-. --. ... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. .---- ..--- ...-- ....- ..... -.... --... ---.. ----. -----";
        String actual = Morse.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
        System.out.print(expected + "  " + actual);
    }
}