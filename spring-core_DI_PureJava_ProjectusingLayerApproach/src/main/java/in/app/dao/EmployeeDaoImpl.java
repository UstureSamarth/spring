package in.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import in.app.bo.EmployeeBO;

@Repository(value = "dao")
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	@Qualifier("hikaridatasource")
	private DataSource datasource;
	private static final String INSERT_QUERY = "insert into Employee(`ename`,`eage`,`eaddress`) values(?,?,?);";
	private static final String SELECT_ALL_QUERY = "select eid,ename,eage,eaddress from Employee ;";

	@Override
	public String save(EmployeeBO bo) {
		Integer result = 0;
		String msg = "Record inserted failed";
		try (Connection connection = datasource.getConnection();
				PreparedStatement psmt = connection.prepareStatement(INSERT_QUERY);) {
			psmt.setString(1, bo.geteName());
			psmt.setInt(2, bo.getEage());
			psmt.setString(3, bo.getEaddress());

			result = psmt.executeUpdate();
			if (result > 0)
				msg = "Record inserted successfully";

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public List<EmployeeBO> findAllEmployee() {
		List<EmployeeBO> lBo = new ArrayList<EmployeeBO>();
		try (Connection connection = datasource.getConnection();
				PreparedStatement psmt = connection.prepareStatement(SELECT_ALL_QUERY);) {
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				EmployeeBO bo = new EmployeeBO();
				Integer eid = rs.getInt(1);
				String eName = rs.getString(2);
				Integer eAge = rs.getInt(3);
				String eAddr = rs.getString(4);
				bo.setEid(eid);
				bo.seteName(eName);
				bo.setEage(eAge);
				bo.setEaddress(eAddr);
				lBo.add(bo);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lBo;
	}

	@Override
	public String updateById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
