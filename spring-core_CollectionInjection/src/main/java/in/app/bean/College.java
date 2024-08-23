package in.app.bean;

import java.util.Date;
import java.util.List;

public class College {
	private List<String> nameList;
	private List<Date> dateList;

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
		System.out.println(nameList.getClass().getName());
	}

	public void setDateList(List<Date> dateList) {
		System.out.println(dateList.getClass().getName());
		this.dateList = dateList;
	}

	@Override
	public String toString() {
		return "College [nameList=" + nameList + ", dateList=" + dateList + "]";
	}

}
