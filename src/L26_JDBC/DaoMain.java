package L26_JDBC;

public class DaoMain {
	public static void main(String[] args) {
		DAO<Product> productDAO = new ProductMemoryDAO();

		productDAO.create(new Product(1, "hep", "ygfh", 500));
		productDAO.create(new Product(2, "dhtg", "ygfh", 572));
		productDAO.create(new Product(3, "tjfhg", "dfbc", 500));
		productDAO.create(new Product(4, "hep", "ygfh", 8254));
		productDAO.create(new Product(5, "hdgcbv", "zgrsfv", 58));
		productDAO.create(new Product(6, "hep", "jyfg", 8652));

		workWithProducts(productDAO);



	}

	private static void workWithProducts(DAO<Product> productDAO) {
		Product product = productDAO.findById(2);
		System.out.println(product);

		product.setName("Crocodile");
		productDAO.update(product);

		Product product2 = productDAO.findById(2);
		System.out.println(product2);

		productDAO.create(new Product(10, "Monkey", "Madagascar", 3_000));

		System.out.println(productDAO.findAll());
	}
}
