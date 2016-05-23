package L26_JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDbDAO implements DAO<Product> {
	private Connection connection;

	public ProductDbDAO() {
		System.setProperty("jdbc.drivers", "org.postgresql.Driver");

		try {
			connection =
					DriverManager.getConnection(
							"jdbc:postgresql://localhost:5432/postgres",
							"postgres", "postgres");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public boolean create(Product product) {
		String s = "INSERT INTO product (id, name, category, price) VALUES (?,?,?,?)";

		int rowsInserted = 0;
		try {
			PreparedStatement statement = connection.prepareStatement(s);
			statement.setInt(1, product.getId());
			statement.setString(2, product.getName());
			statement.setString(3, product.getCategory());
			statement.setInt(4, product.getPrice());

			rowsInserted = statement.executeUpdate();
			System.out.println("Created : " + rowsInserted);

			statement.close();
			return rowsInserted == 1;
		} catch (Exception e) {
			return false;
		}
	}


	@Override
	public List<Product> findAll() {
		List<Product> result = null;
		try {
			Statement statement = connection.createStatement();
			String sql = "SELECT id, name, category, price From product";

			ResultSet resultSet = statement.executeQuery(sql);

			result = new ArrayList<>();

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String category = resultSet.getString("category");
				int price = resultSet.getInt("price");

				result.add(new Product(id, name, category, price));
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return result;
	}


	@Override
	public Product findById(int _id) {
		try {
			Product result = null;
			Statement statement = connection.createStatement();
			String sql = "SELECT name, category, price From product WHERE id = " + _id;

			ResultSet resultSet = statement.executeQuery(sql);
			result = null;
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				String category = resultSet.getString("category");
				int price = resultSet.getInt("price");
				result = new Product(_id, name, category, price);
			}

			resultSet.close();
			statement.close();
			return result;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}


	}


	@Override
	public void update(Product product) {
		try {
			String sql = "UPDATE product SET price = ?, name = ?, category = ? WHERE id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setInt(1, product.getPrice());
			statement.setString(2, product.getName());
			statement.setString(3, product.getCategory());
			statement.setInt(4, product.getId());

			statement.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}



	@Override
	public void delete(Product product) {
		try {
			String s = "DELETE from product WHERE id = ?";
			PreparedStatement statement = connection.prepareStatement(s);

			statement.setInt(1, product.getId());

			statement.executeUpdate();

			statement.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}










}
