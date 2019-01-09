package AbstractExample;

public class test {
	public static void main(String[] args) {
		IOS p=new IOS();
		Android b=new Android();
		
		p.setName("Una");
		p.setId("AHH");
		
		b.setName("cina");
		b.setId("AHHa");
		
		System.out.println(p.getId()+""+p.getName());
		
		p.work();
	}
}
