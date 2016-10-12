package Morse;

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
        
        return (String) letters
        .stream()
        .reduce("", (prev, current) -> {
            String result = (String) Dictionary.values()
            .entrySet()
            .stream()
            .filter(code -> {
                String currentCode = ((Map.Entry<String, String>)code)
                .getKey()
                .toString();
                
                boolean result = current.toString().equals(currentCode);
                return false;
            })
            .findFirst()
            .orElse(null);
            
            return result;
        });
    }
    
    public static void main(String[] args) {
        String expected = ".- -... -.-. -.. . ..-. --. ... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. .---- ..--- ...-- ....- ..... -.... --... ---.. ----. -----";
        String actual = Morse.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
        System.out.print(expected + "  " + actual);
    }
}