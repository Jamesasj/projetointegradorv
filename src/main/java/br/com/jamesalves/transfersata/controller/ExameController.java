package br.com.jamesalves.transfersata.controller;

import br.com.jamesalves.transfersata.model.Exame;
import br.com.jamesalves.transfersata.model.Requisito;
import br.com.jamesalves.transfersata.repository.ExameDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/exame")
public class ExameController {

    @Autowired
    ExameDAO dao;

    @GetMapping("/{id}")
    public Exame readExamebyId(@PathVariable(value="id")Long id){
        Optional<Exame> exame = dao.findById(id);
        return exame.get();
    }

    @GetMapping("/listAll")
    public List<Exame> readAll(){
        return dao.findAll();
    }

    @GetMapping("/listFacilDeploy")
    public String readFall(){
        return  "ok! Deploy Realizado";
    }

    @PostMapping("/")
    public Exame createExame(@RequestBody Exame e){
        Exame aux = dao.save(e);
        return aux;
    }

    @PutMapping("/addRequisito")
        public Exame addRequisit(@RequestBody Exame e){
            Exame aux = dao.save(e);
            return aux;
        }

    }

