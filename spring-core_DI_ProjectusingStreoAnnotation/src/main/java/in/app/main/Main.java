package in.app.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.app.controller.MainController;
import in.app.vo.CustomerVO;

public class Main {

	private static MainController controller;

	public static void main(String[] args) throws Exception {

		String cName;
		String cAddress;
		String principleAmt;
		String noOfYears;
		String rateOfInterest;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name : ");
		cName = sc.nextLine();
		System.out.print("Enter Customer Address : ");
		cAddress = sc.nextLine();
		System.out.print("Enter Principle amount : ");
		principleAmt = sc.nextLine();
		System.out.print("Enter Number of years : ");
		noOfYears = sc.nextLine();
		System.out.print("Enter Rate of Interest : ");
		rateOfInterest = sc.nextLine();

		CustomerVO vo = new CustomerVO();
		vo.setcName(cName);
		vo.setcAddress(cAddress);
		vo.setPrincipleAmt(principleAmt);
		vo.setNoOfYears(noOfYears);
		vo.setRateOfInterest(rateOfInterest);

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

		controller = factory.getBean("controller", MainController.class);

		String result = controller.processResult(vo);
		if ("success".equals(result)) {
			System.out.println("Record inserted successfully");
		} else {
			System.out.println("Record not inserted");
		}

		sc.close();
		factory.close();

	}
}
