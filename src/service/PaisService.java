package service;

import model.Pais;

import dao.PaisDao;


public class PaisService {
	PaisDao dao = new PaisDao();
	
	public int criar(Pais pais) {
		return dao.criar();
	}
	
	public void atualizar(Pais pais){
		dao.atualizar();
	}
	
	public void excluir(int id){
		dao.excluir();
	}
	
	public Pais carregar(int id){
		return dao.carregar();
	}

}