package API.String;

public class StringDemo {
	public static void main(String[] args) {
		String str="what";
		System.out.println(str);
		str="why";
		System.out.println(str);
		
		
//		���󴴽���ʽ�Ƚ�
		String one=new String("abc");
		String two="abc";
		System.out.println(one);
		System.out.println(two);
		
//		�Ƚϵ�ַfalse,δ��дequals������true
		System.out.println(one==two);
		System.out.println(one.equals(two));
	}
}
