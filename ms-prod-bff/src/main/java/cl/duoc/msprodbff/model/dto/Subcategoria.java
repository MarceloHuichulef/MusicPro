package cl.duoc.msprodbff.model.dto;
import java.util.List;

public class Subcategoria {
    private int idSubcategoria;
    private String nombre;
    private List<Instrumento> instrumentosByIdSubcategoria;

    public Subcategoria(){        
    }
    public int getIdSubcategoria(){
        return idSubcategoria;
    }
    public void setIdSubcategoria(int idSubcategoria){
        this.idSubcategoria = idSubcategoria;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public List<Instrumento> getInstrumentosByIdSubcategoria(){
        return instrumentosByIdSubcategoria;
    }
    public void setInstrumentosByIdSubcategoria(List<Instrumento> instrumentosByIdSubcategoria){
        this.instrumentosByIdSubcategoria = instrumentosByIdSubcategoria;
    }
}
