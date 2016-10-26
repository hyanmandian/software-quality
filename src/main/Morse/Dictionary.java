package Morse;

import java.util.stream.Stream;

public interface Dictionary {
    public String getKey();
    public String getValue();
//    public Enum[] values();
    public Stream getValues();
}
