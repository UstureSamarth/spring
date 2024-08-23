package in.app.bean;

import java.util.Date;
import java.util.Set;

public class ContactInfo {
	private Set<Long> phoneNumbers;
	private Set<Date> dates;

	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		System.out.println(phoneNumbers.getClass().getName());
		this.phoneNumbers = phoneNumbers;
	}

	public Set<Date> getDates() {
		return dates;
	}

	public void setDates(Set<Date> dates) {
		System.out.println(dates.getClass().getName());
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "ContactInfo [phoneNumbers=" + phoneNumbers + ", dates=" + dates + "]";
	}

}
