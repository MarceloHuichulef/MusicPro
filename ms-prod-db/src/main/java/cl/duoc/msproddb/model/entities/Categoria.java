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
import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonManagedReference;


import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idCategoria;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "categoriaByCategoriaIdFk", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Column(nullable = true)
    @JsonManagedReference
    private Collection<Instrumento> instrumentosByIdCategoria;
}
