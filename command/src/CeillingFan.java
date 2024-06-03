public class CeillingFan {
    int velocidade = 0;

    public void lowSpeed() {

        velocidade = 1;
        System.out.println( "Ceiling Fan is at low speed");
    }
    public void mediumSpeed() {
        velocidade = 2;
        System.out.println( "Ceiling Fan is at medium speed");
    }
    public void highSpeed() {
        velocidade = 3;
        System.out.println("Ceiling Fan is at high speed") ;
    }

    public int getSpeed() {
        return velocidade;
    }

    public void off(){
        velocidade = 0;
        System.out.println("Ceiling Fan is off");
    }
}
