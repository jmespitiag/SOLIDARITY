import java.util.ArrayList;
public class Usuario {
    private String nombre;
    private String codigo;
    private int identificacion;

    public String getNombre(){
        return this.nombre;
    }

    public int getIdentificacion(){
        return this.identificacion;
    }

    public String getCodigo(){
        return this.codigo;
    }


    Usuario(String n, String c, int i){
        this.nombre = n;
        this.codigo = c;
        this.identificacion = i;
    }

    Usuario(){}

    public void donarDinero(long d){
        System.out.println("");
        System.out.println("________La donación de "+d+"$ pesos se ha realizado exitosamente");
        System.out.println("");
    }

    public static Usuario crearUsuario(String n, String c, int i){
        Usuario u = new Usuario(n,c,i);
        return u;
    }

    public void imprimirUsuario(){

        System.out.println("Nombre: "+this.nombre);
        System.out.println("Código: "+this.codigo);
        System.out.println("identificación: "+this.identificacion);

    }
}