package cl.duoc.msproddb.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Collection;

import lombok.Data;

@Data
@Entity
@Table(name = "subcategoria")
public class Subcategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idSubcategoria;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "subcategoriaBySubcategoriaIdFk", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Column(nullable = true)
    @JsonManagedReference
    private Collection<Instrumento> instrumentosByIdSubcategoria;
}
