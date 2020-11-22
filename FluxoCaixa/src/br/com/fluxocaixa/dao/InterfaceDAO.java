package br.com.fluxocaixa.dao;

import java.util.List;

public interface InterfaceDAO<T> {
	public void inserir(T referencia);
	public void deletar(T referencia);
	public List<T> buscar();
	public T buscarId(Integer id);
	public void atualizar(T referencia);
}
