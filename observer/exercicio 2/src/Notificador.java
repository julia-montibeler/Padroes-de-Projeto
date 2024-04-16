import java.util.ArrayList;

public class Notificador {
    public static void notificar(ArrayList<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            u.notificacao();
        }
    };
}
