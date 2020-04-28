import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int [] a = {2,3,4,5,6,12,3,4};
		int [] b = {4,6,3,77,4,3};
		int l = a.length + b.length;
		int [] c = new int[l];
		
		int i = 0;
		for ( i = 0 ; i < a.length;i++) {
			c[i] = a[i];
		}
		for (int j = 0;j<b.length;  j++) {
			c[i] = b[j];
			i++;
		}
		
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		int[] d = new int[l];
		i = 0;
		for(int j = c.length -1; j >=0; j--) {
			d[i] = c[j];
			i++;
		}
		System.out.println(Arrays.toString(d));
	}

}
