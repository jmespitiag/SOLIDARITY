public class Bonificacion extends Usuario{
    private String marca;
    private String tipo;

    Bonificacion(Usuario u, String m, String t){
        super(u.getNombre(),u.getCodigo(),u.getIdentificacion());
        this.marca = m;
        this.tipo = t;
    }
    public String getMarca() {
        return this.marca;
    }
    public String getTipo() {
        return this.tipo;
    }
    public static String generarBonificacionM() {
        String[] marcas = {"Mc Donalds", "Burger king", "H&M", "Zara", "Dior", "Nike"};
        int random = (int) (Math.random() * (0 - 5) + 5);
        return marcas[random];
    }
    public static String generarBonificacionT() {
        String[] Tipo = {"DESCUENTO", "BONO", "PRIORIDAD", "REGALO"};
        int random = (int) (Math.random() * (0 - 3) + 3);
        return Tipo[random];
    }
    public static void recibirBonificacion(Usuario u){
        Bonificacion bono = new Bonificacion(u, Bonificacion.generarBonificacionM(), Bonificacion.generarBonificacionT());
        System.out.println("_________Bonificación generada y recibida________");
        System.out.println("Marca: "+bono.getMarca());
        System.out.println("Tipo: "+bono.getTipo());
        System.out.println("");
    }
    }


