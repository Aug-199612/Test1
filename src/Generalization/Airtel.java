package Generalization;

public class Airtel implements Superclass1 {

	@Override
	public void audioCall() {
		System.out.println("airtel gives 5000 min/month free");
		
	}

	@Override
	public void vedioCall() {
		System.out.println("airtel offer 1.5GB/day 4G data free");
		
	}

	@Override
	public void messaging() {
		System.out.println("airtel gives 100 msgs free per month");
		
	}

	@Override
	public void fiveGService() {
		System.out.println("airtel giving five G services");
		
	}

}
