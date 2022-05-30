package com.robbo.cursomc.service;

import com.robbo.cursomc.domain.Categoria;
import com.robbo.cursomc.repositories.CategoriaRepository;
import com.robbo.cursomc.service.exceptions.ObjectiveNotFoundeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

//    public Categoria buscar(Integer id){
//        Optional<Categoria> obj = repo.findById(id);
//
//        if(obj == null){
//            throw  new ObjectiveNotFoundeException("Objeto não encontrado id " + id + "tipo " + Categoria.class.getName());
//        }
//        return obj.orElse(null);
//    }


        public Optional<Categoria> buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);

        if(obj.isEmpty() || !obj.isPresent()){
            throw  new ObjectiveNotFoundeException("Objeto não encontrado id " + id + " tipo " + Categoria.class.getName());
        }

        return obj;
    }
}
