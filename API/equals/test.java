package API.equals;

public class test {
	public static void main(String[] args) {
		Person p1=new Person("kino",18);
		Person p2=new Person("Jins",19);
		
		boolean b=p1.equals(p1);
		System.out.println(b);
	}
}
