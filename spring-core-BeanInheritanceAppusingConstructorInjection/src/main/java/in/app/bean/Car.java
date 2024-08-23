package in.app.bean;

public class Car {

	private String regNo;
	private int engineNo;
	private String type;
	private String model;
	private String company;
	private String color;
	private String owner;
	private String fuelType;
	private int engineCC;

	public Car(String regNo, int engineNo, String type, String model, String company, String color, String owner,
			String fuelType, int engineCC) {
		System.out.println("9 param contructor is instantiating");
		this.regNo = regNo;
		this.engineNo = engineNo;
		this.type = type;
		this.model = model;
		this.company = company;
		this.color = color;
		this.owner = owner;
		this.fuelType = fuelType;
		this.engineCC = engineCC;
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", engineNo=" + engineNo + ", type=" + type + ", model=" + model + ", company="
				+ company + ", color=" + color + ", owner=" + owner + ", fuelType=" + fuelType + ", engineCC="
				+ engineCC + "]";
	}

}
