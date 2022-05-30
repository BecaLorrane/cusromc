package com.robbo.cursomc.repositories;

import com.robbo.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
