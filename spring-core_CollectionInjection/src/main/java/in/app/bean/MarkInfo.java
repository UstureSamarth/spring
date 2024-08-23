package in.app.bean;

import java.util.Arrays;
import java.util.Date;

public class MarkInfo {
	private int[] marks;
	private Date[] dates;

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public Date[] getDates() {
		return dates;
	}

	public void setDates(Date[] dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "MarkInfo [marks=" + Arrays.toString(marks) + ", dates=" + Arrays.toString(dates) + "]";
	}

}
