import java.util.concurrent.TimeUnit;
import java.util.Random; 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.ListIterator;


public class DataStructures {
	
	private static final float MAX = (float) 0;
	private static final float MIN = (float) 9;
	
	private ArrayList<Float> arraylist;
	private LinkedList<Float> linkedlist;
	private float[] table;
	
	private Random r;
	
	private int n;
	
	public DataStructures (int n) {
		this.n = n;
		this.arraylist = new ArrayList<Float>();
		this.linkedlist = new LinkedList<Float>();
		this.table = new float[this.n];
		this.r = new Random();
	}

	
	public double ArrayListAddTime() {
		
		float value;
		
		long startTime = System.nanoTime();
		
		for (int i = 0; i<n ; i++) {
			value = MIN + r.nextFloat() * (MAX - MIN);
			arraylist.add(value);
		}
		
		long endtime = System.nanoTime();
		long timeElapsed = (endtime - startTime);
		double elapsedTimeInSecond = (double) timeElapsed / 1000000000;
		
		return elapsedTimeInSecond;

	}
	
	public double LinkedListAddTime() {
		
		float value;
		
		long startTime = System.nanoTime();
		
		for (int i = 0; i<n ; i++) {
			value = MIN + r.nextFloat() * (MAX - MIN);
			linkedlist.add(value);
		}
		
		long endtime = System.nanoTime();
		long timeElapsed = (endtime - startTime);
		double elapsedTimeInSecond = (double) timeElapsed / 1000000000;
		
		return elapsedTimeInSecond;

	}
	
	public double TableAddTime() {

		float value;
		
		long startTime = System.nanoTime();
		
		
		for (int i = 0; i<n ; i++) {
			value = MIN + r.nextFloat() * (MAX - MIN);
			table[i]=value;
		}
		
		long endtime = System.nanoTime();
		long timeElapsed = (endtime - startTime);
		double elapsedTimeInSecond = (double) timeElapsed / 1000000000;
		
		return elapsedTimeInSecond;
		
	}
	
	public double accumulateLinkedList() {
		
		float adding = 0;
		ListIterator iter = linkedlist.listIterator();
		
		long startTime = System.nanoTime();

		
		while (iter.hasNext()) {
			adding = adding + (Float)iter.next();
		}
		
		long endtime = System.nanoTime();
		long timeElapsed = (endtime - startTime);
		double elapsedTimeInSecond = (double) timeElapsed / 1000000000;
		
		return elapsedTimeInSecond;
		
	}
	
	public double accumulateArrayList() {
		
		float adding = 0;
		ListIterator iter = arraylist.listIterator();
		
		long startTime = System.nanoTime();

		
		while (iter.hasNext()) {
			adding = adding + (Float)iter.next();
		}
		
		long endtime = System.nanoTime();
		long timeElapsed = (endtime - startTime);
		double elapsedTimeInSecond = (double) timeElapsed / 1000000000;
		
		return elapsedTimeInSecond;
		
	}
	
	public double accumulateTable() {
		
		float adding = 0;
		
		long startTime = System.nanoTime();

		
		for (int i = 0; i<n; i++) {
			adding = adding + table[i];
		}
		
		long endtime = System.nanoTime();
		long timeElapsed = (endtime - startTime);
		double elapsedTimeInSecond = (double) timeElapsed / 1000000000;
		
		return elapsedTimeInSecond;
		
	}
	
	public void clear() {
		arraylist.clear();
		linkedlist.clear();
	}
	
	public static void main(String[] args) throws InterruptedException {
		int r = 10;
		int n = 42000000;

		DataStructures addtime = new DataStructures(n);
		

		double[] arraylistTime = new double[r];
		double[] linkedlistTime = new double[r];
		double[] tableTime = new double[r];
		
		//double[] arraylistAddTime = new double[r];
		//double[] linkedlistAddTime = new double[r];
		//double[] tableAddTime = new double[r];
		
		
		for(int i = 0; i<r; i++) {
			addtime.clear();
			arraylistTime[i] = addtime.ArrayListAddTime() ;
			linkedlistTime[i] = addtime.LinkedListAddTime();
			tableTime[i] = addtime.TableAddTime();
		}
		
//		for(int i = 0; i<r; i++) {
//			arraylistAddTime[i] = addtime.accumulateArrayList();
//			linkedlistAddTime[i] = addtime.accumulateLinkedList();
//			tableAddTime[i] = addtime.accumulateTable();
//		}
		
		Arrays.sort(arraylistTime);
		Arrays.sort(linkedlistTime);
		Arrays.sort(tableTime);

		System.out.println("It took " + arraylistTime[(int)(r/2)] + " seconds to add " + n + " random float values in the ArrayList.");
		//System.out.println("It took " + arraylistAddTime[(int)(r/2)] + " seconds to accumulate " + n + " random float values from ArrayList.\n");

		System.out.println("It took " + linkedlistTime[(int)(r/2)] + " seconds to add " + n + " random float values in the LinkedList.");
		//System.out.println("It took " + linkedlistAddTime[(int)(r/2)] + " seconds to accumulate " + n + " random float values from LinkedList.\n");
		
		System.out.println("It took " + tableTime[(int)(r/2)] + " seconds to add " + n + " random float values in the table.");
		//System.out.println("It took " + tableAddTime[(int)(r/2)] + " seconds to accumulate " + n + " random float values from table.\n");

	}

}
