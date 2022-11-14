package Generalization;

public class Vodafone implements Superclass1 {
	@Override
	public void audioCall() {
		System.out.println("vodafone gives 5000 min/month free");
		
	}

	@Override
	public void vedioCall() {
		System.out.println("vodafone offer 1.5GB/day 4G data free");
		
	}

	@Override
	public void messaging() {
		System.out.println("vodafone gives 150 msgs free per month");
		
	}

	@Override
	public void fiveGService() {
		System.out.println("vodafone not giving five G services");
		
	}

}
