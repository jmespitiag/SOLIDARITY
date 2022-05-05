import java.util.ArrayList;
public class Solicitante {
    private String nombre;
    private String codigo;
    private int identificacion;
    private String discapacidad;


    public String getNombre() {
        return this.nombre;
    }

    public int getIdentificacion() {
        return this.identificacion;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDiscapacidad() {
        return this.discapacidad;
    }


    Solicitante(String n, String c, int i, String d) {
        this.nombre = n;
        this.codigo = c;
        this.identificacion = i;
        this.discapacidad = d;
    }

    Solicitante() {
    }

    public static Solicitante crearSolicitante(String n, String c, int i, String d){
        Solicitante s = new Solicitante(n,c,i,d);
        return s;
    }

    public void imprimirSolicitante(){

        System.out.println("Nombre: "+this.nombre);
        System.out.println("Código: "+this.codigo);
        System.out.println("identificación: "+this.identificacion);
        System.out.println("Discapacidad:"+ this.discapacidad);

    }

}
