import java.util.ArrayList;
public class Solicitud extends Solicitante{
    private boolean estado;
    private int tipo;


    Solicitud(Solicitante s){
        super(s.getNombre(),s.getCodigo(),s.getIdentificacion(),s.getDiscapacidad());
       this.estado = false;
    }

    public static Solicitud crearSolicitud(Solicitante s){
        Solicitud P= new Solicitud(s);
        return P;
    }

    public boolean getEstado() {
        return this.estado;
    }
    public int getTipo() {
        return this.tipo;
    }

    public void setEstado(boolean e) {
        this.estado = e;
    }
    public void setTipo(int t) {
       this.tipo = t;
    }

}
