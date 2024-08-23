package in.app.bean;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {
	private Map<Integer, String> facultyDetails;
	private Map<String, Date> dateInfo;
	private Properties technologies;

	public void setFacultyDetails(Map<Integer, String> facultyDetails) {
		System.out.println(facultyDetails.getClass().getName());
		this.facultyDetails = facultyDetails;
	}

	public void setDateInfo(Map<String, Date> dateInfo) {
		System.out.println(dateInfo.getClass().getName());
		this.dateInfo = dateInfo;
	}

	public void setTechnologies(Properties technologies) {
		System.out.println(technologies.getClass().getName());
		this.technologies = technologies;
	}

	@Override
	public String toString() {
		return "UniversityInfo [facultyDetails=" + facultyDetails + ", dateInfo=" + dateInfo + ", technologies="
				+ technologies + "]";
	}

}
