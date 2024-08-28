package in.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.app.dto.EmployeeDTO;
import in.app.service.IEmployeeService;
import in.app.vo.EmployeeVO;

@Component(value = "controller")
public class EmployeeControllerImpl implements IEmployeeController {

	@Autowired
	private IEmployeeService service;

	@Override
	public String save(EmployeeVO vo) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.geteName());
		dto.setEage(Integer.parseInt(vo.getEage()));
		dto.setEaddress(vo.getEaddress());
		return service.save(dto);
	}

	@Override
	public List<EmployeeVO> findAllEmployee() {
		List<EmployeeDTO> ldto = service.findAllEmployee();
		List<EmployeeVO> lVO = new ArrayList<EmployeeVO>();
		for (EmployeeDTO e : ldto) {
			EmployeeVO vo = new EmployeeVO();
			vo.seteName(e.getEname());
			vo.setEage(e.getEage().toString());
			vo.setEaddress(e.getEaddress());
			vo.setEid(e.getEid());
			lVO.add(vo);
		}
		return lVO;
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
