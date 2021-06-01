package Activities;

public class Activity3 {

	
	public static void main(String[] args) {
		
	//--------------------Years Calculations------------------
	//	Planets			Days in Years	Seconds in Year		Result
	//	Earth			365.25			31557600			31.68808781
	//	 Mercury		87.96925718		7600543.82			131.5695329
	//	 Venus			224.7007992		19414149.05			51.50882469
	//	 Mars			686.967971		59354032.69			16.84805488
	//	 Jupiter		4332.820129		374355659.1			2.671256533
	//	 Saturn			10755.69864		929292362.9			1.076087612
	//	 Uranus			30687.153		2651370019			0.377163501
	//	 Neptune		60190.02963		5200418560			0.192292214
		
		double seconds = 1000000000;
		double Earthseconds = seconds/31557600;
		double Mercuryseconds = seconds/7600543.82;
		double Venusseconds = seconds/19414149.05;
		double Marsseconds = seconds/59354032.69;
		double Jupiterseconds = seconds/374355659.1;
		double Saturnseconds = seconds/929292362.9;
		double Uranusseconds = seconds/2651370019D;
		double Neptuneseconds = seconds/5200418560D;
		
		System.out.println("Someone on Earth with 1,000,000,000 seconds old will be of age : "+ Earthseconds + " Years");
		System.out.println("Someone on Mecury with 1,000,000,000 seconds old on Earth will be of age : "+ Mercuryseconds + " Years");
		System.out.println("Someone on Venus with 1,000,000,000 seconds old on Earth will be of age : "+ Venusseconds + " Years");
		System.out.println("Someone on Mars with 1,000,000,000 seconds old on Earth will be of age : "+ Marsseconds + " Years");
		System.out.println("Someone on Jupiter with 1,000,000,000 seconds old on Earth will be of age : "+ Jupiterseconds + " Years");
		System.out.println("Someone on Saturn with 1,000,000,000 seconds old on Earth will be of age : "+ Saturnseconds + " Years");
		System.out.println("Someone on Uranus with 1,000,000,000 seconds old on Earth will be of age : "+ Uranusseconds + " Years");
		System.out.println("Someone on Neptunes with 1,000,000,000 seconds old on Earth will be of age : "+ Neptuneseconds + " Years");
		
	}

}
