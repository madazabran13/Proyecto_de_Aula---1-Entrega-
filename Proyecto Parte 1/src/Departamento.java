public class Departamento {
    private  String departamento;
    
    public  Departamento (){
        this.departamento=" ";
    }
    
    public  Departamento (String DEP){
        this.departamento=DEP;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
