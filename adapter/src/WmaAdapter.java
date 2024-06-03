public class WmaAdapter implements FormatoAudio {

    private WmaPlay wmaPlayer;
    
    public WmaAdapter() {
        this.wmaPlayer = new WmaPlay();
    }
    
    @Override
    public void abrir(String arquivo) {
        wmaPlayer.setFile(arquivo);
        wmaPlayer.open();
    }
    
    @Override
    public void reproduzir() {
        wmaPlayer.play();
    }
    
    @Override
    public void parar() {
        wmaPlayer.stop();
    }

}
