package com.juliabonzanini.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliabonzanini.cursomc.domain.Categoria;
import com.juliabonzanini.cursomc.repositories.CategoriaRepository;
import com.juliabonzanini.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
                + ", Tipo: " + Categoria.class.getName()));
    }

}
