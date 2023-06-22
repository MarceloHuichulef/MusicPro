package cl.duoc.msproddb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import cl.duoc.msproddb.model.entities.Subcategoria;
import cl.duoc.msproddb.services.SubcategoriaService;

@RestController
@RequestMapping("/subcategorias")
public class SubcategoriaController {
    
    @Autowired
    SubcategoriaService subcategoriaService;

    @GetMapping(path = "/subcategoria", produces = {"application/json"})
    public List<Subcategoria> getAll(){
        return subcategoriaService.getAll();
    }
    @PostMapping(path = "/subcategoria", consumes = {"application/json"}, produces = {"application/json"})
    public Subcategoria add(@RequestBody Subcategoria subcategoria){
        return subcategoriaService.add(subcategoria);
    }
}
