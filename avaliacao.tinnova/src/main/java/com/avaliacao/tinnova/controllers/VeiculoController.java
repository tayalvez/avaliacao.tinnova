package com.avaliacao.tinnova.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;  
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
    public boolean saveStudent(@RequestBody Veiculo veiculo) {  
         return veiculoService.saveVeiculo(veiculo);  
          
    }
    @CrossOrigin
    @GetMapping("veiculos")
    public List<Veiculo> allVeiculos() {  
         return veiculoService.getVeiculos();  
          
    }
    @CrossOrigin
    @DeleteMapping("deletarVeiculo/{id}")
    public boolean deleteStudent(@PathVariable("id") long id,Veiculo veiculo) {  
    	veiculo.setId(id);  
        return veiculoService.deleteVeiculo(veiculo);  
    }

    @CrossOrigin
    @GetMapping("veiculo/{id}")  
    public List<Veiculo> getVeiculoByID(@PathVariable("id") long id) {
         return veiculoService.getVeiculoByID(id);
    }

    @CrossOrigin
    @PostMapping("updateVeiculo/{id}")  
    public boolean updateVeiculo(@RequestBody Veiculo veiculo,@PathVariable("id") long id) {
        veiculo.setId(id);  
        return veiculoService.updateVeiculo(veiculo);  
    }

    @CrossOrigin
    @RequestMapping("getQtdVeiculosNaoVendidos")
    public int getQtdVeiculosNaoVendidos() {
        return veiculoService.getQtdVeiculosNaoVendidos();
    }

}
