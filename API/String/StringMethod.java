package API.String;

public class StringMethod {
	public static void main(String[] args) {
		function2();
	}
	
	public static void function2(){
		String str1="Abc";
		String str2="abc";
//		equals����,���ִ�Сд�Ͳ����ִ�Сд
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
//		toCharArray()�������ַ���ת����
		String str3="longway";
		char ch[]=str3.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
		System.out.println("");
		
//		����String�෽��getBytes�ַ���ת���ֽ�����
		String str4="dfsds";
		byte[] bytes=str4.getBytes();
		for(int j=0;j<bytes.length;j++){
			System.out.print(bytes[j]+" ");
		}
		System.out.println("");
		
//		int indexOf(char ch)
//		 ����һ���ַ�,���ַ����е�һ�γ��ֵ�����
		String str5="dsddvdsdevf";
		int index=str5.indexOf('v');
		System.out.println(index);
		System.out.println("");
		
		
//		boolean contains (String s)
//		�ж�һ���ַ�����,�Ƿ������һ���ַ���
		String str6="sdvsvfssx";
		boolean con=str6.contains("sx");
		System.out.println(con);
		
		
//		others:
/*		boolean endsWith(String prefix)
 * 		boolean startsWith(String prefix) 
 * 		String substring(int beginIndex,int endIndex) ��ȡ�ַ�����һ����
 * 		int length() �����ַ����ĳ���
*/		
	}
}
