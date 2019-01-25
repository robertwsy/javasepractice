package API.String;

public class StringMethod {
	public static void main(String[] args) {
		function2();
	}
	
	public static void function2(){
		String str1="Abc";
		String str2="abc";
//		equals方法,区分大小写和不区分大小写
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
//		toCharArray()方法，字符串转数组
		String str3="longway";
		char ch[]=str3.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
		System.out.println("");
		
//		调用String类方法getBytes字符串转成字节数组
		String str4="dfsds";
		byte[] bytes=str4.getBytes();
		for(int j=0;j<bytes.length;j++){
			System.out.print(bytes[j]+" ");
		}
		System.out.println("");
		
//		int indexOf(char ch)
//		 查找一个字符,在字符串中第一次出现的索引
		String str5="dsddvdsdevf";
		int index=str5.indexOf('v');
		System.out.println(index);
		System.out.println("");
		
		
//		boolean contains (String s)
//		判断一个字符串中,是否包含另一个字符串
		String str6="sdvsvfssx";
		boolean con=str6.contains("sx");
		System.out.println(con);
		
		
//		others:
/*		boolean endsWith(String prefix)
 * 		boolean startsWith(String prefix) 
 * 		String substring(int beginIndex,int endIndex) 获取字符串的一部分
 * 		int length() 返回字符串的长度
*/		
	}
}
