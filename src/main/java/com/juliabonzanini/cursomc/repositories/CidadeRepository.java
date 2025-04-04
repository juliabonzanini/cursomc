package com.juliabonzanini.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juliabonzanini.cursomc.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
    // Aqui podemos definir métodos personalizados de consulta, se necessário.
    // O Spring Data JPA irá implementar automaticamente os métodos padrão.
}

