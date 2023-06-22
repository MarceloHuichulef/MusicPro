package cl.duoc.msproddb.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.msproddb.model.entities.Categoria;
import cl.duoc.msproddb.services.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    
    @Autowired
    CategoriaService categoriaService;
    
    @GetMapping(path = "/categoria", produces = { "application/json" })
    public List<Categoria> getAll(){
        return categoriaService.getAll();
    }

    @PostMapping(path = "/categoria", consumes = {"application/json"}, produces = {"application/json"})
    public Categoria add(@RequestBody Categoria categoria){
        return categoriaService.add(categoria);
    }    
}
