import java.util.ArrayList;

public class Subject {

    private boolean estado = false;

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void registrar(Usuario u) {
        usuarios.add(u);

    };

    public void notificar() {
        Notificador.notificar(usuarios);
        Observer.update(this);
    };

    public void remover(Usuario u) {
        usuarios.remove(u);
    };

    public void setEstado(boolean e) {
        this.estado = e;

        if (estado) {
            notificar();
        }
        
    }

}
