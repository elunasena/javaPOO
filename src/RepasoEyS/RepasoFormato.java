package RepasoEyS;

public class RepasoFormato {

	public static void main(String[] args) {
		
		float c1 = 1.50f;
		double a = 2.5;
		
		((Object)c1).getClass().getName();
		
		System.out.println(c1+a + " " + ((Object)(c1+a)).getClass().getName());
		
	}
	
}
