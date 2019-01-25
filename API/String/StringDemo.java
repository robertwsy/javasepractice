package API.String;

public class StringDemo {
	public static void main(String[] args) {
		String str="what";
		System.out.println(str);
		str="why";
		System.out.println(str);
		
		
//		对象创建方式比较
		String one=new String("abc");
		String two="abc";
		System.out.println(one);
		System.out.println(two);
		
//		比较地址false,未重写equals方法，true
		System.out.println(one==two);
		System.out.println(one.equals(two));
	}
}
