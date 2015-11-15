package com.mark.services.inf;

import java.util.List;

/**
 * CURD services in server side
 * 
 * @author Mark
 *
 * @param <T>
 *            Type of POJO
 */
public interface IService<T> {
	/**
	 * Create an item
	 * 
	 * @param t
	 *            item instance
	 * @return created item
	 */
	T create(T t);

	/**
	 * Read all items
	 * 
	 * @return all items
	 */
	List<T> read();

	/**
	 * Read item by id
	 * 
	 * @param id
	 *            item id
	 * @return item
	 */
	T read(long id);

	/**
	 * Update item
	 * 
	 * @param t
	 *            item
	 * @return updated item
	 */
	T update(T t);

	/**
	 * Delete item by id
	 * 
	 * @param id
	 *            item id
	 * @return deleted item
	 */
	T delete(long id);
}
