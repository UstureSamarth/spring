package in.app.comp;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalDateTime date;

	@Autowired
	private List<String> l;

	public String generateWishMessage(String name) {

		System.out.println("Date is " + date);
		System.out.println(l);

		Integer hour = date.getHour();
		if (hour <= 12) {
			return "Hello " + name + " Good Morning";
		} else if (hour <= 16) {
			return "Hello " + name + " Good AfterNoon";
		} else if (hour <= 20) {
			return "Hello " + name + " Good Evening";
		} else {
			return "Hello " + name + " Good Night";

		}

	}

}
