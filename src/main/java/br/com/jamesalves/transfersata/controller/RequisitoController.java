package br.com.jamesalves.transfersata.controller;

import br.com.jamesalves.transfersata.model.Exame;
import br.com.jamesalves.transfersata.model.Requisito;
import br.com.jamesalves.transfersata.repository.ExameDAO;
import br.com.jamesalves.transfersata.repository.RequisitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/requisito")
public class RequisitoController {
    
    @Autowired
    RequisitoRepository dao;

    @GetMapping("/{id}")
    public Requisito readExamebyId(@PathVariable(value="id")Long id){
        Optional<Requisito> requisito = dao.findById(id);
        return requisito.get();
    }

    @GetMapping("/listAll")
    public List<Requisito> readAll(){
        return dao.findAll();
    }

    @GetMapping("/listFacilDeploy")
    public String readFall(){
        return  "ok! Deploy Realizado";
    }

    @PostMapping("/")
    public Requisito createExame(@RequestBody Requisito e){
        Requisito aux = dao.save(e);
        return aux;
    }
}
