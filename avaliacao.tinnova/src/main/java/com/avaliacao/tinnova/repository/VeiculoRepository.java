package com.avaliacao.tinnova.repository;

import java.util.List;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.query.Query;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;  

import com.avaliacao.tinnova.interfaces.repository.IVeiculoRepository;
import com.avaliacao.tinnova.model.Veiculo;

@Repository
public class VeiculoRepository implements IVeiculoRepository{
	
	@Autowired  
    private SessionFactory sessionFactory; 
	
	@Override  
    public boolean save(Veiculo veiculo) {  
        boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().save(veiculo);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }  
	
	@Override  
    public List<Veiculo> getVeiculos() {  
        Session currentSession = sessionFactory.getCurrentSession();  
        Query<Veiculo> query=currentSession.createQuery("from Veiculo", Veiculo.class);  
        List<Veiculo> list=query.getResultList();  
        return list;  
    }  
  
    @Override  
    public boolean delete(Veiculo veiculo) {  
        boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().delete(veiculo);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }  
  
    @Override  
    public List<Veiculo> getVeiculoByID(long id) {  
        Session currentSession = sessionFactory.getCurrentSession();  
        Query<Veiculo> query=currentSession.createQuery("from Veiculo where id=:id", Veiculo.class);  
        query.setParameter("id", id);  
        List<Veiculo> list=query.getResultList();  
        return list;  
    }

    @Override
    public List<Veiculo> getVeiculosNaoVendidos() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Veiculo> query=currentSession.createQuery("from Veiculo where vendido  = false", Veiculo.class);
        List<Veiculo> list=query.getResultList();
        return list;
    }

    @Override  
    public boolean update(Veiculo veiculo) {  
        boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().update(veiculo);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }  
      
}
