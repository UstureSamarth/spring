package in.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.app.dto.CustomerDTO;
import in.app.service.ICustomerMgmtService;
import in.app.vo.CustomerVO;

@Component(value = "controller")
public class MainController {
	
	static {
		System.out.println("Controller is loaded");
	}
	
	@Autowired
	private ICustomerMgmtService service;

	public String processResult(CustomerVO vo) {
		CustomerDTO dto = new CustomerDTO();
		dto.setcName(vo.getcName());
		dto.setcAddress(vo.getcAddress());
		dto.setPrincipleAmt(Double.parseDouble(vo.getPrincipleAmt()));
		dto.setNoOfYears(Double.parseDouble(vo.getNoOfYears()));
		dto.setRateOfInterest(Double.parseDouble(vo.getNoOfYears()));
		String result = service.calculateSimpleInterest(dto);
		return result;
	}

}
