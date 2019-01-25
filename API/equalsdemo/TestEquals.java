package API.equalsdemo;

public class TestEquals {
	public static void main(String[] args) {
		cat a=new cat("weight",15);
		cat b=new cat("grey",16);
		cat c=new cat("grey",16);
		System.out.println(a==b);
		System.out.println(a.equals(b));
//		直接使用继承的equals方法作用与==等价
		System.out.println(b==c);
		System.out.println(b.equals(c));
		
		
//		新建dog类 重写equals方法
		dog aa=new dog("green",12);
		dog bb=new dog("green",12);
//		两个对象参数相同
		System.out.println(aa.equals(bb));
		
	}

}

class cat{
	String color;
	int weight;
	public cat(String color, int weight) {
//		super();
		this.color = color;
		this.weight = weight;
	}
}



class dog{
	String color;
	int weight;
	public dog(String color, int weight) {
//		super();
		this.color = color;
		this.weight = weight;
	}
	
	public boolean equals(Object obj){
		if (obj==null){
			return false;
		}
		else{
			if(obj instanceof dog){
				dog aa=(dog)obj;
				if (aa.color==this.color && aa.weight==this.weight){
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
}
