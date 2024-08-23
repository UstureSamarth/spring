package in.app.main;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.app.controller.MainController;
import in.app.vo.CustomerVO;

public class Main {
	public static void main(String[] args) {

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

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		Resource resource = new ClassPathResource("applicationContext.xml");
		reader.loadBeanDefinitions(resource);

		MainController controller = factory.getBean("controller", MainController.class);

		String result = controller.processResult(vo);
		if ("success".equals(result)) {
			System.out.println("Record inserted successfully");
		} else {
			System.out.println("Record not inserted");
		}

		sc.close();

	}
}
