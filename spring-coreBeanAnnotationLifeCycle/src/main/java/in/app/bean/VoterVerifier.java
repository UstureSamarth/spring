package in.app.bean;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voterVerifier")
@PropertySource(value = "input.properties")
public class VoterVerifier {

	@Value("${voterVerifier.name}")
	private String name;

	@Value("${voterVerifier.age}")
	private float age;

	@Autowired
	private Date dateOfVerification;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public Date getDateOfVerification() {
		return dateOfVerification;
	}

	public void setDateOfVerification(Date dateOfVerification) {
		this.dateOfVerification = dateOfVerification;
	}

	public String checkEligibility() {
		if (age < 18)
			return name + " you are not eligible ";
		return name + " you are  eligible ";
	}

	@Override
	public String toString() {
		return "VoterVerifier [name=" + name + ", age=" + age + ", dateOfVerification=" + dateOfVerification + "]";
	}

	@PostConstruct
	public void ourInit() {
		System.out.println("VoterVerifier.outInit() custom init method");
		if(name==null || age<=0)
			throw new IllegalArgumentException("name or age is invalid");
	}

	@PreDestroy
	public void ourDestroy() {
		System.out.println("VoterVerifier.outInit() custom destroy method");
		name = null;
		age = 0.0f;
		dateOfVerification = null;
	}

}
