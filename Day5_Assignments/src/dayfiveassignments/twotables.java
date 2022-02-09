package dayfiveassignments;
import java.util.Scanner;

public class twotables {
	
	public static int num;
	public static int power;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner in = new Scanner (System.in)) {
			
			System.out.println("Enter any number for the table");
			num = in.nextInt();
			
			System.out.println("Enter any number for power value of table number");
			power = in.nextInt();
		}
				
		if(power <= 31) {
			
			System.out.println("Table of input number is ");
			
			for(int i=1; i<=power; i++) {
				
				int result = num*i;
				
				System.out.println(result);
				
			}
		}else {
			
			System.out.println("Enter power  value is grater then 31 try again");
		}

	}

}
