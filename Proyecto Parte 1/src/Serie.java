
public class Serie {
    private  int codigo ;
    private String descripcion;
    
    public Serie (){
        this.codigo=0;
        this.descripcion="";
    }
    
    public Serie (int codi,String desc){
        this.codigo=codi;
        this.descripcion=desc;
    }
    
    public int getCodigo_() {
        return codigo;
    }

    public void setCodigo_(int codigo_) {
        this.codigo = codigo_;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
