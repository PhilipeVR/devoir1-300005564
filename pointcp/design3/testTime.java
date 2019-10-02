import java.util.concurrent.TimeUnit;
import java.util.Random; 

public class testTime {
	
	
	public long efficiencyAnalysis() {
		
		Random random = new Random();
		
		long startTime = System.nanoTime();
		
		for (int i=0; i<5000;i++) {
			PointCP point = new PointCP(random.nextDouble()*15, random.nextDouble()*25);
			point.getTheta();
			//point.getRho();
			//point.getX();
			//point.getY();
		}
		
		long endtime = System.nanoTime();
		long timeElapsed = (endtime - startTime);
		
		return timeElapsed;

		
	}
	
	public static void main(String[] args) throws InterruptedException {
		testTime test = new testTime();
		
		double avgCalc = 0.0;
		
		for (int i = 0; i<1000; i++) {
			avgCalc = avgCalc + test.efficiencyAnalysis();
		}
		avgCalc = (avgCalc/1000000);
		System.out.println("Average execution time in milliseconds : " + 
				(avgCalc/1000) + "\n");
		
	}
	

}