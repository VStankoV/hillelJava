package L26_JDBC;

import java.util.List;

public interface DAO <T>{
	boolean create(T product);

	List<T> findAll();

	T findById(int _id);

	void update(T product);

	void delete(T product);
}
