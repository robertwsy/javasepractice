package AbstractExample;

public abstract class Employee {

	private String name;
	private String Id;
	
	//工作方法（抽象方法）
	public abstract void work();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	} 
	
}
