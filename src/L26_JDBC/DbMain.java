package L26_JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbMain {
	private Connection connection;

	public DbMain(Connection connection) {
		this.connection = connection;
	}

	public Map<String, Integer> findNameAndPrice() throws Exception {
		Statement statement = connection.createStatement();
		String sql = "SELECT name, price From product";

		ResultSet resultSet = statement.executeQuery(sql);

		Map<String, Integer> result = new HashMap<>();

		while (resultSet.next()) {

			String name = resultSet.getString("name");
			int price = resultSet.getInt(2);
			result.put(name, price);
		}

		resultSet.close();
		statement.close();

		return result;

	}

	public List<Product> findAllProducts() throws Exception {
		Statement statement = connection.createStatement();
		String sql = "SELECT id, name, category, price From product";

		ResultSet resultSet = statement.executeQuery(sql);

		List<Product> result = new ArrayList<>();

		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			String category = resultSet.getString("category");
			int price = resultSet.getInt("price");

			result.add(new Product(id, name, category, price));
		}

		resultSet.close();
		statement.close();

		return result;

	}

	public Product findById(int _id) throws Exception {
		Statement statement = connection.createStatement();
		String sql = "SELECT name, category, price From product WHERE id = " + _id;

		ResultSet resultSet = statement.executeQuery(sql);
		Product result = null;
		while (resultSet.next()) {
			String name = resultSet.getString("name");
			String category = resultSet.getString("category");
			int price = resultSet.getInt("price");
			result = new Product(_id, name, category, price);
		}

		resultSet.close();
		statement.close();

		return result;

	}

	public void updatePriceByName(String name, int price) throws Exception {
		String sql = "UPDATE product SET price = ? WHERE name = ?";
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setInt(1, price);
		statement.setString(2, name);

		int rowsUpdated = statement.executeUpdate();


		System.out.println("Updated : " + rowsUpdated);

	}

	public void createProduct(Product product) throws SQLException {
		String s = "INSERT INTO product (id, name, category, price) VALUES (?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(s);

		statement.setInt(1, product.getId());
		statement.setString(2, product.getName());
		statement.setString(3, product.getCategory());
		statement.setInt(4, product.getPrice());

		int rowsInserted = statement.executeUpdate();
		System.out.println("Created : " + rowsInserted);

		statement.close();
	}

	public void deleteById(int id) throws Exception {
		String s = "DELETE from product WHERE id = ?";
		PreparedStatement statement = connection.prepareStatement(s);

		statement.setInt(1, id);

		int rowsInserted = statement.executeUpdate();
		System.out.println("Deleted : " + rowsInserted);

		statement.close();

	}

	public static void main(String[] args) throws Exception {
		System.setProperty("jdbc.drivers", "org.postgresql.Driver");

		Connection connection =
				DriverManager.getConnection(
						"jdbc:postgresql://localhost:5432/postgres",
						"postgres", "postgres");

		DbMain main = new DbMain(connection);
//		Map<String, Integer> nameAndPrice = dbMain.findNameAndPrice();
//		System.out.println(nameAndPrice);

//		List<Product> allProducts = dbMain.findAllProducts();
//		System.out.println(allProducts);
//
//		System.out.println(dbMain.findById(3));


//		main.updatePriceByName("' OR true --", 8_888_888);


//		main.createProduct(new Product(5,"Giraffe", "Afr anim", 24_000));


		main.deleteById(3);

		connection.close();

	}
}
