package com.juliabonzanini.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliabonzanini.cursomc.domain.Pedido;
import com.juliabonzanini.cursomc.repositories.PedidoRepository;
import com.juliabonzanini.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
                + ", Tipo: " + Pedido.class.getName()));
    }

}
