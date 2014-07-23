public class Car{
	private String VIN;
	private String regNumber;

	public Car(String VIN, String regNumber){
		this.VIN = VIN;
		this.regNumber = regNumber;
	}

	public String toString(){
		return this.VIN + " " + this.regNumber;
	}
}
