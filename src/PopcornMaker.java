
public class PopcornMaker {

	public static void main(String[] args) {
		
		Microwave M = new Microwave();
		Popcorn P = new Popcorn("poppy");
		M.putInMicrowave(M.thingToBeCooked);
		P.applyHeat();
		
		M.setTime(10);
		
		
	}
}
