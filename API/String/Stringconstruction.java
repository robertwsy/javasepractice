package API.String;

public class Stringconstruction {
	public static void main(String[] args) {
		function_1();
	}
	
	public static void function_1(){
//		���췽��1��String(byte[] bytes)  �����ֽ�����
		byte[] bytes = {97,98,99,100};
		String s =new String(bytes);
		System.out.println(s);
		
//		���췽��2��String(byte[] bytes, int offset, int length) �����ֽ�����
		byte[]  bytes1= {23,24,11,66};
		String s1=new String(bytes,1,3);
		String s2=new String(bytes1,1,2);
		System.out.println(s1);
		System.out.println(s2);
		
//		���췽��3��public String(char[] value):���ַ�����ת���ַ���
//		public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
		char[] ch={'a','b','c','d','e'};
		String cha=new String(ch);
		System.out.println(cha);
		
		String cha1=new String(ch,1,3);
		System.out.println(s1);
		
		
	}
}
