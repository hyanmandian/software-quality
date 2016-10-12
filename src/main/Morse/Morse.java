package Morse;

public class Morse {
    
    private Encoder encoder;
    private Decoder decoder;
    
    public Morse() {
        this.encoder = new Encoder();
        this.decoder = new Decoder();
    }
    
    public static String encode(String str) {
        Morse morse = new Morse();
        
        return morse.encoder.encode(str);
    }
    
//    public static String decode(String str){
//        Morse morse = new Morse();
//        
//        return morse.decoder.decode(str);
//    }
    
}
