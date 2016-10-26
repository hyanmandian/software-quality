package Morse;

import Morse.Dictionaries.PT;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Encoder {
    private final Dictionary dictionary;
    
    public Encoder(Dictionary dictionary) {
        this.dictionary = dictionary;
    }
    
    public String encode(String str) {
        List letters = str
        .chars()
        .mapToObj(e->(char)e)
        .collect(Collectors.toList());
        
        Stream tokens = this.dictionary.getValues();
        
        return letters
        .stream()
        .reduce("", (prev, current) -> {
            String token = tokens
            .filter(code -> {
                System.out.print(code);
                String expected = current.toString();
                String actual = code.getKey().toString();
                
                return expected.equals(actual);
            })
            .findFirst()
            .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", current)))
            .getValue();
            
            return prev + " " + token;
        })
        .toString()
        .trim();
    }
}