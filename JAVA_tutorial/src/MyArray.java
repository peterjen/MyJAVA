import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grades = new int[10];
		int[] ages = {22,33,99,55};
		int[][] nn = {{22,33},{44,55}};
		
		grades[0] = 10;
		System.out.println(grades[0] + " " + ages[3]);
		System.out.println(Arrays.toString(ages));
		System.out.println(Arrays.deepToString(nn));
/*		
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 0;i<3;i++) {
			int x =  scanner.nextInt();
			a[i] = x;
		}
		System.out.println(Arrays.toString(a));
*/
		System.out.println(Arrays.binarySearch(ages,33));
		
// SORT
		Arrays.sort(ages);
		System.out.println(Arrays.toString(ages));
		
		int[] a1 = {2,3,4};
		int[] a2 = {2,3,4};
		int[] a3 = a1;
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(Arrays.equals(a1, a2));  // CORRECT WAY TO CHECK EQUALS
		System.out.println("-----------------");
		System.out.println(a1==a3);
		System.out.println(a1.equals(a3));
		System.out.println(Arrays.equals(a1, a3));  
		
		Arrays.fill(a1, 33);
		System.out.println(Arrays.toString(a1));
		
		String[] ss = new String[3];
		Arrays.fill(ss, "aaa");
		System.out.println(Arrays.toString(ss));
		List<String> lst = Arrays.asList(ss);

//ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		System.out.println(al.get(0));
		al.set(0, 33);
		System.out.println(al.get(0));
		
//LIST
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> linklist = new LinkedList<Integer>();
		
		list.add(5);
		list.add(10);
		list.add(1,7);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println(list.indexOf(5));
		System.out.println(list.contains(7));
		System.out.println(list.isEmpty());
		
		list.remove(0);
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
		
		
		int[] ma = {1,3,5,7,9};
		List<Integer> ml = Arrays.asList(2,4,6,8,10);

		System.out.println(Arrays.toString(ma));
		System.out.println(ml.toString());
		System.out.println(Arrays.toString(ml.toArray()));
		
		for(int i=0;i < ml.size();i++) {
			ml.set(i, ml.get(i) * 2);
			System.out.println(ml.get(i));
		}
		for(int v : ml) {  // FOR through LIST
			System.out.println(v);
		}
		for(int v : ma) {  // FOR through ARRAY
			System.out.println(v);
		}
		
		// 2D List
		List<List<Integer>> ml2d = new ArrayList<List<Integer>>();
		ml2d.add(Arrays.asList(2,4,6,8,10));
		ml2d.add(Arrays.asList(1,3,5,7,9));
		ml2d.add(Arrays.asList(1,2,3,4,5));
		System.out.println("2D LIST:");
		for(List<Integer> i : ml2d) {
			for (int k : i) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.toString(ml2d.toArray()));  // LIST to ARRAY
		
		
		// SORT LIST
		List<Integer> ms = Arrays.asList(2,7,4,1,9,6,0,11);
		Collections.sort(ms);
		//Collections.reverse(ms);
		
		System.out.println("SORT LIST:");
		for(int i : ms) {
			System.out.println(i);
		}
		
	}

}
