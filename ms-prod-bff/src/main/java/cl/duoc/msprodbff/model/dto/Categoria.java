package cl.duoc.msprodbff.model.dto;

import java.util.List;

public class Categoria {
    
    private int idCategoria;
    private String nombre;
    private List<Instrumento> instrumentosbyIdCategoria;

    public Categoria(){
    }
    public int getIdCategoria(){
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Instrumento> getInstrumentosByIdCategoria(){
        return instrumentosbyIdCategoria;
    }
    public void setInstrumentosByIdCategoria(List<Instrumento> instrumentosByIdCategoria) {
        this.instrumentosbyIdCategoria = instrumentosByIdCategoria;
    }
}
