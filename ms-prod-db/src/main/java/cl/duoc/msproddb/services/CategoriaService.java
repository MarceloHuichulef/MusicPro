package cl.duoc.msproddb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msproddb.model.entities.Categoria;
import cl.duoc.msproddb.model.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public List<Categoria> getAll(){
        return categoriaRepository.findAll();
    }
    public Categoria add(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
