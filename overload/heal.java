package overload;
//usual extends and overload
//hero class

class hero{
	String name;
}
public class heal extends hero{
	public void healing(String name){
		System.out.println(name+" Healing for self.");
	} 
	public void healing(String name,int hp){
		System.out.println("healing "+hp+"hp for "+name);
	}
	public static void main(String[] args) {
		heal Solaka=new heal();
		Solaka.healing("Solaka");
		heal Solaka2=new heal();
		Solaka2.healing("Garen",50);	
	}

}
