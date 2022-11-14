package Generalization;

public class gene_implement {

	public static void main(String[] args) {
	Airtel a =new Airtel();
	a.audioCall();
	a.vedioCall();
	a.messaging();
	a.fiveGService();
	 System.out.println("_______________________");
	 
	RelianceJio b =new RelianceJio();
	    b.audioCall();
		b.vedioCall();
		b.messaging();
		b.fiveGService();
		 System.out.println("_______________________");
		 
		
		Vodafone c =new Vodafone();
	    c.audioCall();
		c.vedioCall();
		c.messaging();
		c.fiveGService();
		 System.out.println("_______________________");
		 
		
		

	}

}
