package in.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import in.app.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDao {

	static {
		System.out.println("CustomerDAOImpl is loading...");
	}

	private DataSource datasource;

	public CustomerDAOImpl(DataSource datasource) {
		System.out.println("CustomerDAOImpl.CustomerDAOImpl()");
		this.datasource = datasource;
	}

	@Override
	public int insert(CustomerBO cBO) {
		int result = 0;
		try (Connection connection = datasource.getConnection()) {
			System.out.println("Connection established ...");
			String sql = "INSERT INTO FinancialDetails (cName, cAddress, principleAmt, noOfYears, rateOfInterest, interestAmount) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, cBO.getcName());
			preparedStatement.setString(2, cBO.getcAddress());
			preparedStatement.setDouble(3, cBO.getPrincipleAmt());
			preparedStatement.setDouble(4, cBO.getNoOfYears());
			preparedStatement.setDouble(5, cBO.getRateOfInterest());
			preparedStatement.setDouble(6, cBO.getInterestAmount());

			int rowsInserted = preparedStatement.executeUpdate();

			// 6. Check the result
			if (rowsInserted > 0) {
				result = 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}