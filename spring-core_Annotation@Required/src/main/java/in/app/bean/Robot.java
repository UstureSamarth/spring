package in.app.bean;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Robot {
	private Integer id = 123;
	private String name;
	private String lab;
	private Double price;

	public Integer getId() {
		return id;
	}

	
	@Required
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", lab=" + lab + ", price=" + price + "]";
	}

}
