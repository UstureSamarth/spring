package in.app.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.app.config.AppConfig;
import in.app.controller.EmployeeControllerImpl;
import in.app.controller.IEmployeeController;
import in.app.vo.EmployeeVO;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		IEmployeeController controller = factory.getBean("controller", EmployeeControllerImpl.class);

		try {
			while (true) {
				System.out.println("1.Create");
				System.out.println("2.Read");
				System.out.println("3.ReadAllRecords");
				System.out.println("4.Update");
				System.out.println("5.Delete");
				System.out.println("6.Exit");
				System.out.print("Enter option :");
				Integer option = sc.nextInt();
				sc.nextLine();
				switch (option) {
				case 1:
					System.out.print("Enter Name :");
					String ename = sc.nextLine();
					System.out.print("Enter Age :");
					String eage = sc.nextLine();
					System.out.print("Enter Address :");
					String eaddress = sc.nextLine();

					EmployeeVO vo = new EmployeeVO();
					vo.seteName(ename);
					vo.setEage(eage);
					vo.setEaddress(eaddress);

					String status = controller.save(vo);
					System.out.println(status);
					break;
				case 2:
					break;
				case 3:
					List<EmployeeVO> le = controller.findAllEmployee();
					le.forEach(System.out::println);
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					System.out.println("Thank you for using Application");
					System.exit(0);
				default:
					System.out.println("Enter correct option");
				}

			}
		} finally {
			sc.close();
			factory.close();
		}

	}
}
