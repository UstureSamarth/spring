package in.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.app.bo.EmployeeBO;
import in.app.dao.IEmployeeDao;
import in.app.dto.EmployeeDTO;

@Service(value = "service")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao;

	@Override
	public String save(EmployeeDTO dto) {
		EmployeeBO bo = new EmployeeBO();
		bo.seteName(dto.getEname());
		bo.setEage(dto.getEage());
		bo.setEaddress(dto.getEaddress());
		return dao.save(bo);
	}

	@Override
	public List<EmployeeDTO> findAllEmployee() {
		List<EmployeeBO> lbo=dao.findAllEmployee();
		List<EmployeeDTO> ldto=new ArrayList<EmployeeDTO>();
		for(EmployeeBO e:lbo) {
			EmployeeDTO dto=new EmployeeDTO();
			dto.setEid(e.getEid());
			dto.setEname(e.geteName());
			dto.setEage(e.getEage());
			dto.setEaddress(e.getEaddress());
			ldto.add(dto);
		}
		return ldto;
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
