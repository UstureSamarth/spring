package in.app.service;

import java.util.List;

import in.app.dto.EmployeeDTO;

public interface IEmployeeService {
	String save(EmployeeDTO dto);

	List<EmployeeDTO> findAllEmployee();

	String updateById(Integer id);

	String deleteById(Integer id);
}
