package in.app.dao;

import java.util.List;

import in.app.bo.EmployeeBO;

public interface IEmployeeDao {
	String save(EmployeeBO bo);

	List<EmployeeBO> findAllEmployee();

	String updateById(Integer id);

	String deleteById(Integer id);
}
