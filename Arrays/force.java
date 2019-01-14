package Arrays;

public class force {
	public static void main(String[] args) {
		int values []=new int[]{12,54,32,65};
		for(int i=0;i<values.length;i++){
			int each=values[i];
			System.out.println(each);
		}
		System.out.println(" ");
		for (int each:values){
			System.out.println(each);
		}
	}

}
