package Morse.Dictionaries;

import Morse.Dictionary;

public enum PT implements Dictionary {

    CODEA("A", ".-"),
    CODEB("B", "-..."),
    CODEC("C", "-.-."),
    CODED("D", "-.."),
    CODEE("E", "."),
    CODEF("F", "..-."),
    CODEG("G", "--."),
    CODEH("H", "..."),
    CODEI("I", ".."),
    CODEJ("J", ".---"),
    CODEK("K", "-.-"),
    CODEL("L", ".-.."),
    CODEM("M", "--"),
    CODEN("N", "-."),
    CODEO("O", "---"),
    CODEP("P", ".--."),
    CODEQ("Q", "--.-"),
    CODER("R", ".-."),
    CODES("S", "..."),
    CODET("T", "-"),
    CODEU("U", "..-"),
    CODEV("V", "...-"),
    CODEW("W", ".--"),
    CODEX("X", "-..-"),
    CODEY("Y", "-.--"),
    CODEZ("Z", "--.."),
    CODE1("1", ".----"),
    CODE2("2", "..---"),
    CODE3("3", "...--"),
    CODE4("4", "....-"),
    CODE5("5", "....."),
    CODE6("6", "-...."),
    CODE7("7", "--..."),
    CODE8("8", "---.."),
    CODE9("9", "----."),
    CODE0("0", "-----");

    private String key;
    private String value;

    private PT(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }
}
