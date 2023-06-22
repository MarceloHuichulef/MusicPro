package cl.duoc.msproddb.model.entities;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name = "instrumento")
public class Instrumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_instrumento")
    private int idInstrumento;

    @Basic
    @Column (name = "nombre")
    private String nombre;

    @Basic
    @Column (name = "marca")
    private String marca;

    @Basic
    @Column (name = "id_categoria")
    private int idCategoria;

    @Basic
    @Column (name = "id_subcategoria")
    private int idsubcategoria;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_categoria", referencedColumnName = "id" , insertable = false, updatable = false)
    @JsonBackReference
    private Categoria categoriaByCategoriaIdFk;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_subcategoria", referencedColumnName = "id" , insertable = false, updatable = false)
    @JsonBackReference
    private Subcategoria subcategoriaBySubcategoriaIdFk;

    public Instrumento() {
    }
    public int getIdInstrumento() {
        return idInstrumento;
    }
    public void setIdInstrumento(int idInstrumento) {
        this.idInstrumento = idInstrumento;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
