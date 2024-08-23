package in.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.app.bo.CustomerBO;
import in.app.dao.ICustomerDao;
import in.app.dto.CustomerDTO;

@Service(value = "service")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	
	static {
		System.out.println("Service is loaded");
	}

	@Autowired
	private ICustomerDao dao;

	public static double calculateSimpleInterest(double principal, double rate, double time) {
		return (principal * rate * time) / 100;
	}

	@Override
	public String calculateSimpleInterest(CustomerDTO customer) {
		CustomerBO bo = new CustomerBO();
		bo.setcName(customer.getcName());
		bo.setcAddress(customer.getcAddress());
		bo.setPrincipleAmt(customer.getPrincipleAmt());
		bo.setNoOfYears(customer.getNoOfYears());
		bo.setRateOfInterest(customer.getRateOfInterest());
		bo.setInterestAmount(calculateSimpleInterest(customer.getPrincipleAmt(), customer.getNoOfYears(),
				customer.getRateOfInterest()));
		int result = dao.insert(bo);
		String msg;
		if (result == 1)
			msg = "success";
		else
			msg = "failure";
		return msg;
	}

}
