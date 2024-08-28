package in.app.service;

import in.app.bo.CustomerBO;
import in.app.dao.ICustomerDao;
import in.app.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	private ICustomerDao dao;

	static {
		System.out.println("CustomerMgmtServiceImpl is loading...");
	}

	public CustomerMgmtServiceImpl(ICustomerDao dao) {
		System.out.println("CustomerMgmtServiceImpl.CustomerMgmtServiceImpl()");
		this.dao = dao;
	}

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