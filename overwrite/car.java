package overwrite;

public class car {
	private String carno;
	private String carname;
	private String color;
	private double price;
	
	car(String carno,String carname,String color,double price){
		this.carno=carno;
		this.carname=carname;
		this.color=color;
		this.price=price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCarno() {
		return carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//overwrite toString
//	public String toString(){
//		return "this car name is "+carname+",and type is "+carno+",color is "+color+". price:"+price;
//		
//	}
//	
	
	public static void main(String[] args) {
		car mycar=new car("BWM","S5","white",10000.00);
		System.out.println(mycar.toString());
	}

	@Override
	public String toString() {
		return "car [carno=" + carno + ", carname=" + carname + ", color=" + color + ", price=" + price + "]";
	}
	
}
