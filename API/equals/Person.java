package API.equals;

public class Person extends Object{
	private String name;
	private int age;
	
	public Person(){}
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public boolean equals(Object obj){
		return this==obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}