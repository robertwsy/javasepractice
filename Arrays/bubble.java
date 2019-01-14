package Arrays;

public class bubble {
	public static void main(String[] args) {
		int a []=new int []{12,15,56,85,5,42};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
		System.out.println(" ");
		
//		for(int i=0;i<a.length-1;i++){
//			if(a[i]>a[i+1]){
//				int temp=a[i];
//				a[i]=a[i+1];
//				a[i+1]=temp;
//			}
//		}
//		
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]+"");
//		}
//		System.out.println(" ");
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];	
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
		System.out.println(" ");
	}

}
