package com.avaliacao.tinnova.interfaces.service;

import java.util.List;

import com.avaliacao.tinnova.model.Veiculo;

public interface IVeiculoService {
	
	public boolean saveVeiculo(Veiculo veiculo);  
    public List<Veiculo> getVeiculos();  
    public boolean deleteVeiculo(Veiculo veiculo);  
    public Veiculo getVeiculoByID(long id);
    public boolean updateVeiculo(Veiculo veiculo);
    public int getQtdVeiculosNaoVendidos();
}
