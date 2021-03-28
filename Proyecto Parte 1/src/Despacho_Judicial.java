public class Despacho_Judicial {
    private String nombre;
    private int codigo;
    private String categoria ;
    private  String departamento;

    public  Despacho_Judicial(){
        this.nombre="";
        this.codigo=0;
        this.categoria="";
    }

    public  Despacho_Judicial(String N, int C , String CA){
        this.nombre=N;
        this.codigo=C;
        this.categoria=CA;
    }
    
    public Despacho_Judicial(String DE){
        departamento=DE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
