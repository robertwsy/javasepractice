package Arrays;

public class memory {
	public static void main(String[] args) {
		int[] arr=new int[3];
		System.out.println(arr);
		//		result
		/*
		 * [I@7852e922
		 * 数组+Integer整数+十六进制数
		 * 
		 * 数组在内存中的首地址
		 */
		System.out.println(arr[0]);
//		result 0 创建数组时就为数组赋值 0
		
		int[] arr1=new int[]{1,2,3};
		System.out.println(arr1[2]);
//		抛出异常
		System.out.println(arr1[4]);
	}
	
	

}
