package L26_JDBC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMemoryDAO implements DAO<Product> {

	private Map<Integer, Product> products = new HashMap<>();

	@Override
	public boolean create(Product product) {
		products.put(product.getId(), product);
		return false;
	}

	@Override
	public List<Product> findAll() {
		List<Product> products = new ArrayList<>(this.products.values());
		return products;
	}

	@Override
	public Product findById(int _id) {
		return products.get(_id);
	}

	@Override
	public void update(Product product) {
		create(product);
	}

	@Override
	public void delete(Product product) {
		products.remove(product.getId());
	}
}
