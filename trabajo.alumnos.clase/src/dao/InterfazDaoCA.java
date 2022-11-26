package dao;

import java.util.ArrayList;
// TERMINADO

public interface  InterfazDaoCA<T> {

	/**
	 * Muestra todos los objetos T de la base de datos
	 * 
	 * @return un ArrayList de objetos T
	 */
	public ArrayList<T> buscarTodos();
	/**
	 * Inserta el objeto T recibido en la base de datos
	 * 
	 * @param t  un objeto T
	 */
	public void insertar(T t);
	
	/**
	 * Modifica el objeto T de la base de datos 
	 * 
	 * @param t un objeto T
	 */
	public void modificar(T t);
	
	/**
	 * Elimina objeto T de la base de datos
	 * 
	 * @param t un objeto T
	 */
	public void borrar(T t);
	
	/**
	 * Muestra el objeto T de la base de datos con el id especificado
	 * 
	 * @param i 	el id del objeto T
	 * @return 		un objeto T
	 */
	public T buscarPorId (int i);
}
