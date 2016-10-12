package Morse;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {
    
    public Dictionary() {
        // Silence is gold
    }
    
    public static Map values() {
        Map<String, String> codes = new HashMap<String, String>();
        
        codes.put("A", ".-");
        codes.put("B", "-...");
        codes.put("C", "-.-.");
        codes.put("D", "-..");
        codes.put("E", ".");
        codes.put("F", "..-.");
        codes.put("G", "--.");
        codes.put("H", "...");
        codes.put("I", "..");
        codes.put("J", ".---");
        codes.put("K", "-.-");
        codes.put("L", ".-..");
        codes.put("M", "--");
        codes.put("N", "-.");
        codes.put("O", "---");
        codes.put("P", ".--.");
        codes.put("Q", "--.-");
        codes.put("R", ".-.");
        codes.put("S", "...");
        codes.put("T", "-");
        codes.put("U", "..-");
        codes.put("V", "...-");
        codes.put("W", ".--");
        codes.put("X", "-..-");
        codes.put("Y", "-.--");
        codes.put("Z", "--..");
        
        codes.put("1", ".----");
        codes.put("2", "..---");
        codes.put("3", "...--");
        codes.put("4", "....-");
        codes.put("5", ".....");
        codes.put("6", "-....");
        codes.put("7", "--...");
        codes.put("8", "---..");
        codes.put("9", "----.");
        codes.put("0", "-----");

        return codes;
    }
    
}