package cl.duoc.msproddb.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msproddb.model.entities.Subcategoria;
import cl.duoc.msproddb.model.repository.SubcategoriaRepository;


@Service
public class SubcategoriaService {
    @Autowired
    SubcategoriaRepository subcategoriaRepository;

    public List<Subcategoria> getAll(){
        return subcategoriaRepository.findAll();
    }
    public Subcategoria add(Subcategoria subcategoria){
        return subcategoriaRepository.save(subcategoria);
    }
}
