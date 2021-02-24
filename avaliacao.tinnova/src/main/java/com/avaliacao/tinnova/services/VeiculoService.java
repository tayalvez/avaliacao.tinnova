package com.avaliacao.tinnova.services;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;

import com.avaliacao.tinnova.interfaces.repository.IVeiculoRepository;
import com.avaliacao.tinnova.interfaces.service.IVeiculoService;
import com.avaliacao.tinnova.model.Veiculo;

@Service
@Transactional  
public class VeiculoService implements IVeiculoService{
	
	@Autowired  
    private IVeiculoRepository veiculoRepository;  
      
    @Override  
    public boolean saveVeiculo(Veiculo veiculo) {  
        return veiculoRepository.save(veiculo);  
    }  
  
    @Override  
    public List<Veiculo> getVeiculos() {  
        return veiculoRepository.getVeiculos();  
    }  
  
    @Override  
    public boolean deleteVeiculo(Veiculo veiculo) {  
        return veiculoRepository.delete(veiculo);  
    }  
  
    @Override  
    public List<Veiculo> getVeiculoByID(long id) {     	
        return veiculoRepository.getVeiculoByID(id);  
    }  
  
    @Override  
    public boolean updateVeiculo(Veiculo veiculo) {  
        return veiculoRepository.update(veiculo);  
    }

    @Override
    public int getQtdVeiculosNaoVendidos() {
        List<Veiculo> veiculosNaoVendidos = veiculoRepository.getVeiculosNaoVendidos();
        return veiculosNaoVendidos.size();
    }


}
