package overload;

public class ADHero extends hero{
	public void attack(){
		System.out.println(name+" is attack for once.\n");
	}
	public void attack(hero... heros){
		for (int i=0;i<heros.length;i++){
			System.out.println(name+" is attacking "+heros[i].name+"\n");
		}
	}
	public static void main(String[] args) {
		ADHero Cathrin=new ADHero();
		Cathrin.name="Cathrin";
		Cathrin.attack();
		
		hero Garen=new hero();
		hero Teemo=new hero();
		Garen.name="Garen";
		Teemo.name="Teemo";
		//Cathrin.attack(Garen);
		Cathrin.attack(Garen,Teemo);
	}
}
