package com.avaliacao.tinnova.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.tinnova.interfaces.service.IVeiculoService;
import com.avaliacao.tinnova.model.Veiculo;  

@RestController

@RequestMapping(value="/api")
public class VeiculoController {
	@Autowired  
    private IVeiculoService veiculoService;

    @CrossOrigin
    @RequestMapping ("saveVeiculo")
    public ResponseEntity saveStudent(@RequestBody Veiculo veiculo) {
         veiculoService.saveVeiculo(veiculo);
         return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("veiculos")
    public ResponseEntity<List<Veiculo>> allVeiculos() {
         List<Veiculo> veiculos = veiculoService.getVeiculos();
         return new ResponseEntity<List<Veiculo>>(veiculos, HttpStatus.OK);
          
    }
    @CrossOrigin
    @DeleteMapping("deletarVeiculo/{id}")
    public ResponseEntity deleteVeiculo(@PathVariable("id") long id,Veiculo veiculo) {
    	veiculo.setId(id);  
        veiculoService.deleteVeiculo(veiculo);
        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("veiculo/{id}")  
    public ResponseEntity<Veiculo> getVeiculoByID(@PathVariable("id") long id) {
        Veiculo veiculo = veiculoService.getVeiculoByID(id);
        return new ResponseEntity<Veiculo>(veiculo, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("updateVeiculo/{id}")  
    public ResponseEntity updateVeiculo(@RequestBody Veiculo veiculo,@PathVariable("id") long id) {
        veiculo.setId(id);  
        veiculoService.updateVeiculo(veiculo);
        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping("getQtdVeiculosNaoVendidos")
    public ResponseEntity<Integer> getQtdVeiculosNaoVendidos() {
        int qtdNaoVendidos = veiculoService.getQtdVeiculosNaoVendidos();
        return new ResponseEntity<Integer>(qtdNaoVendidos, HttpStatus.OK);
    }

}
