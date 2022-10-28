package dao;

import java.util.ArrayList;

public interface Dao<T> {

	public void insertar(T t);
	
	public void modificar(T t);
	
	public void borrar(T t);
	
	public ArrayList<T> buscarTodos();
	
	public T bucarPorId(int i);
}
