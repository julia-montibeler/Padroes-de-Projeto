public class AudioPlayer {
    public static void main(String[] args) {
        FormatoAudio adapter = new WmaAdapter();
        
        adapter.abrir("arquivo.wma");
        adapter.reproduzir();
        
        adapter.parar();
    }
}
