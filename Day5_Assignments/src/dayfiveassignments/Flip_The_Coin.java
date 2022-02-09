package dayfiveassignments;
import java.util.Random;

public class Flip_The_Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double flip ;
			System.out.println("random number will be dispay hear between 0 to 1");
			Random random=new Random();
			flip= random.nextDouble();
			System.out.println("Random number will be "+ flip);
			
			if(flip >0.5) {
				System.out.println("fliped coin value is tail");
			}else {
				System.out.println("fliped coin value is head");
			}

	}

}
