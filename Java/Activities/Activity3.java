
public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ageInSeconds = 1000000000;
		double earthInSeconds = 31557600;
		double a = ageInSeconds/earthInSeconds;
		System.out.println(a);
		
		double mercuryEarthYears = 0.2408467;
		double venusEarthYears = 0.61519726;
		double marsEarthYears = 1.8808158;
		double jupiterEarthYears = 11.862615;
		double SaturnEarthYears = 29.447498;
		double UranusEarthYears = 84.016846;
		double NeptuneEarthYears = 164.79132;
		
		System.out.println("Age in Mercury : " + ageInSeconds/(earthInSeconds*mercuryEarthYears));
		System.out.println("Age in Venus : " + ageInSeconds/(earthInSeconds*venusEarthYears));
		System.out.println("Age in Mars : " + ageInSeconds/(earthInSeconds*marsEarthYears));
		System.out.println("Age in Jupiter : " + ageInSeconds/(earthInSeconds*jupiterEarthYears));
		System.out.println("Age in Saturn : " + ageInSeconds/(earthInSeconds*SaturnEarthYears));
		System.out.println("Age in Uranus : " + ageInSeconds/(earthInSeconds*UranusEarthYears));
		System.out.println("Age in Neptune : " + ageInSeconds/(earthInSeconds*NeptuneEarthYears));
		
		
	}

}
