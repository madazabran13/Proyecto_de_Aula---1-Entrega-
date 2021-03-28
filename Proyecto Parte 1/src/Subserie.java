public class Subserie {
    private int codig;
    private String descripcion;

    public Subserie() {
        this.codig = 0;
        this.descripcion = "";
    }
    
    public Subserie(int codi, String desc) {
        this.codig = codi;
        this.descripcion = desc;
    }

    public int getCodig() {
        return codig;
    }

    public void setCodig(int codig) {
        this.codig = codig;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
