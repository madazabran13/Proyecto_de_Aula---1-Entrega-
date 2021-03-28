public class Tipo_Documental {
    private String tipo;
   
    public Tipo_Documental(){
       this.tipo="";
    }
     
    public Tipo_Documental(String T){
        this.tipo=T;
    }
   
    public String getTipo() {
        return tipo;
    }

     public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
