package overload;

public class healhero extends hero{
	public void heal(){
		System.out.println(name+" healing for herself.\n");
	}
	public void heal(int hp,hero... heros){
		for (int i=0;i<heros.length;i++){
			System.out.println(name+" is healing for "+heros[i].name+" for "+hp);
		}
	}
	public static void main(String[] args) {
		healhero Solaka=new healhero();
		Solaka.name="Solaka";
		
		hero Garen=new hero();
		hero Yi=new hero();
		Garen.name="Garen";
		Yi.name="Yi";
		Solaka.heal();
		Solaka.heal(50,Yi,Garen);
	}
}
