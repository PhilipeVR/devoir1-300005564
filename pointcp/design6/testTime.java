import java.util.concurrent.TimeUnit;
import java.util.Random; 

public class testTime {
	
	
	public long efficiencyAnalysis() {
		
		Random random = new Random();
		
		long startTime = System.nanoTime();
		
		for (int i=0; i<5000;i++) {
			PointCartesian pointC = new PointCartesian(random.nextDouble()*15, random.nextDouble()*25);
			PointPolar pointP = new PointPolar(pointC);
			pointP.getTheta();
			//pointP.getRho();
			//pointC.getX();
			//pointC.getY();
		}
		
		long endtime = System.nanoTime();
		long timeElapsed = (endtime - startTime)/ 1000000;
		
		return timeElapsed;
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		testTime test = new testTime();

		double avgCalc = 0.0;
		
		for (int i = 0; i<1000; i++) {
			avgCalc = avgCalc + test.efficiencyAnalysis();
		}
		
		System.out.println("Average execution time in milliseconds : " + 
				avgCalc/1000 + "\n");
		
	}
	

}

