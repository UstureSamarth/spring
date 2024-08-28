package in.app.service;

import in.app.dto.CustomerDTO;

public interface ICustomerMgmtService {
	String calculateSimpleInterest(CustomerDTO customer);
}