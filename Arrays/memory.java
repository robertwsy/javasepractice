package Arrays;

public class memory {
	public static void main(String[] args) {
		int[] arr=new int[3];
		System.out.println(arr);
		//		result
		/*
		 * [I@7852e922
		 * ����+Integer����+ʮ��������
		 * 
		 * �������ڴ��е��׵�ַ
		 */
		System.out.println(arr[0]);
//		result 0 ��������ʱ��Ϊ���鸳ֵ 0
		
		int[] arr1=new int[]{1,2,3};
		System.out.println(arr1[2]);
//		�׳��쳣
		System.out.println(arr1[4]);
	}
	
	

}
