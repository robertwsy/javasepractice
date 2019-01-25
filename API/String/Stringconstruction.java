package API.String;

public class Stringconstruction {
	public static void main(String[] args) {
		function_1();
	}
	
	public static void function_1(){
//		构造方法1：String(byte[] bytes)  传递字节数组
		byte[] bytes = {97,98,99,100};
		String s =new String(bytes);
		System.out.println(s);
		
//		构造方法2：String(byte[] bytes, int offset, int length) 传递字节数组
		byte[]  bytes1= {23,24,11,66};
		String s1=new String(bytes,1,3);
		String s2=new String(bytes1,1,2);
		System.out.println(s1);
		System.out.println(s2);
		
//		构造方法3：public String(char[] value):把字符数组转成字符串
//		public String(char[] value,int index,int count):把字符数组的一部分转成字符串
		char[] ch={'a','b','c','d','e'};
		String cha=new String(ch);
		System.out.println(cha);
		
		String cha1=new String(ch,1,3);
		System.out.println(s1);
		
		
	}
}
