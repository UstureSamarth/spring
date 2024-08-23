package in.app.controller;

import in.app.dto.CustomerDTO;
import in.app.service.ICustomerMgmtService;
import in.app.vo.CustomerVO;

public class MainController {

	static {
		System.out.println("CustomerDAOImpl is loading...");
	}

	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController.MainController()");
		this.service = service;
	}

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
