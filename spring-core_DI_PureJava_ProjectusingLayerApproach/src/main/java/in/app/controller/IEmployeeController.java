package in.app.controller;

import java.util.List;

import in.app.vo.EmployeeVO;

public interface IEmployeeController {

	String save(EmployeeVO vo);

	List<EmployeeVO> findAllEmployee();

	String updateById(Integer id);

	String deleteById(Integer id);

}
