package com.robbo.cursomc.repositories;

import com.robbo.cursomc.domain.Estado;
import com.robbo.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
