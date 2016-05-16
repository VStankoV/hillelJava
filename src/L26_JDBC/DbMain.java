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

	public static void main(String[] args) throws Exception {
		System.setProperty("jdbc.drivers", "org.postgresql.Driver");

		Connection connection =
				DriverManager.getConnection(
						"jdbc:postgresql://localhost:5432/postgres",
						"postgres", "postgres");

		DbMain dbMain = new DbMain(connection);
		Map<String, Integer> nameAndPrice = dbMain.findNameAndPrice();
		System.out.println(nameAndPrice);

		List<Product> allProducts = dbMain.findAllProducts();
		System.out.println(allProducts);

		System.out.println(dbMain.findById(3));

		connection.close();

	}
}
