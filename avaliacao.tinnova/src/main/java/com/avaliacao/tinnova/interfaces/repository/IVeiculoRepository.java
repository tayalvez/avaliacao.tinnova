package com.avaliacao.tinnova.interfaces.repository;

import java.util.List;

import com.avaliacao.tinnova.model.Veiculo;

public interface IVeiculoRepository {
	
	public boolean save(Veiculo veiculo);  
    public List<Veiculo> getVeiculos();  
    public boolean delete(Veiculo veiculo);  
    public List<Veiculo> getVeiculoByID(long id);
    public List<Veiculo> getVeiculosNaoVendidos();
    public boolean update(Veiculo veiculo);

}
