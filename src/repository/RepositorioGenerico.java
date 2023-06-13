package repository;

import java.util.List;

public interface RepositorioGenerico<T> {

	public T inserir(T t);
	public T alterar(T t);
	public T excluir(T t);
	public List<T> consultar(T t);
}
