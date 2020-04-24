import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class T_34_51_Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5};
		a[0]=2;
		System.out.println(a[0]);
		//return;
		int[] grades = new int[10];
		int[] ages = {22,33,99,55};
		int[][] nn = {{22,33},{44,55}};
		
		grades[0] = 10;
		System.out.println("---- Print out ARRAY <toString(),deepToString()");
		System.out.println(grades[0] + " " + ages[3]);
		System.out.println("1D array <toString()> : " + Arrays.toString(ages));
		System.out.println("2D array <deepToString()> : " + Arrays.deepToString(nn));
		
/*		
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 0;i<3;i++) {
			int x =  scanner.nextInt();
			a[i] = x;
		}
		System.out.println(Arrays.toString(a));
*/
		System.out.println("---- Search ARRAY <binarySearch()>");
		//ages = {22,33,99,55};
		System.out.println(Arrays.binarySearch(ages,33));
		//System.exit(0);
// SORT
		System.out.println("---- Sort ARRAY");
		//ages = {22,33,99,55};
		Arrays.sort(ages);
		System.out.println(Arrays.toString(ages));
		int[] ages2 = {22,33,99,55,11,2,55,8,7,8,3,6};
		Arrays.parallelSort(ages2);
		System.out.println(Arrays.toString(ages2));
		

		System.out.println("---- Equals ? ARRAY");
		int[] a1 = {2,3,4};
		int[] a2 = {2,3,4};
		int[] a3 = a1;
		System.out.println(a1 + " " + a2 + " " + a3);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(Arrays.equals(a1, a2));  // CORRECT WAY TO CHECK EQUALS
		System.out.println("-----------------");
		System.out.println(a1==a3);
		System.out.println(a1.equals(a3));
		System.out.println(Arrays.equals(a1, a3));  
		
		
		System.out.println("---- FILL(), ARRAY");
		Arrays.fill(a1, 33);
		System.out.println(Arrays.toString(a1));
		
		String[] ss = new String[3];
		Arrays.fill(ss, "aaa");
		System.out.println(Arrays.toString(ss));
		List<String> lst = Arrays.asList(ss);
		System.out.println(lst);
		//System.exit(0);
//ArrayList
		System.out.println("---- ArrayList : ");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(7);
		System.out.println(al.get(0));
		al.set(0, 33);
		System.out.println(al.get(0));
		System.out.println(al);
		System.out.println(al.size());
		//System.exit(0);
//LIST
		// List = Interface, ArrayList/LinkedList = Implementation
		System.out.println("---- LIST : ");
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
		//System.exit(0);
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list);
		list.clear();
		System.out.println(list.size());
		//System.exit(0);
		
		System.out.println("---- ARRAY to LIST <asList()> : ");
		int[] ma = {1,3,5,7,9};
		List<Integer> ml = Arrays.asList(2,4,6,8,10);

		System.out.println(Arrays.toString(ma));
		System.out.println(ml.toString());
		System.out.println(Arrays.toString(ml.toArray()));
		//System.exit(0);
		for(int i=0;i < ml.size();i++) {
			ml.set(i, ml.get(i) * 2);
			System.out.println(ml.get(i));
		}
		
		System.out.println("---- for looping LIST : ");
		for(int v : ml) {  // FOR through LIST
			System.out.println(v);
		}
		System.out.println("---- for looping ARRAY : ");
		for(int v : ma) {  // FOR through ARRAY
			System.out.println(v);
		}
		//System.exit(0);
		
		// 2D List
		List<List<Integer>> ml2d = new ArrayList<List<Integer>>();
		ml2d.add(Arrays.asList(2,4,6,8,10));
		ml2d.add(Arrays.asList(1,3,5,7,9));
		ml2d.add(Arrays.asList(1,2,3,4,5));
		System.out.println("---- 2D LIST:");
		for(List<Integer> i : ml2d) {
			for (int k : i) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println(ml2d.get(0)); 
		System.out.println(Arrays.toString(ml2d.toArray()));  // LIST to ARRAY
		
		
		// SORT LIST
		System.out.println("---- SORT/ REVERSE LIST:");
		List<Integer> ms = Arrays.asList(2,7,4,1,9,6,0,11);
		Collections.sort(ms);
		System.out.println(ms);
		Collections.reverse(ms);
		System.out.println(ms);
		//System.exit(0);
		
		System.out.println("---- LIST to ARRAY : ");
		Integer[] arr = new Integer[ms.size()]; 
        arr = ms.toArray(arr);   
		System.out.println(Arrays.toString(arr));
		//System.exit(0);
		
		for(int i : ms) {
			System.out.print(i + " ");
		}
		
	}

}
