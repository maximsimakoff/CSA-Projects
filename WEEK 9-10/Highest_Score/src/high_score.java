import java.util.*;
public class high_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name=null;
		int count;
		double score=0;
		double high=0;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter how many students you have");
		int numofstudent=input.nextInt();
		
		for (count=0; count<numofstudent; count++) {
			System.out.print("\n"+"Student name: ");
			name = input.next().toUpperCase();
			System.out.print("Score: ");
			score=input.nextInt();
			
			if(high<score) 
				high=score;
				
		}
		System.out.print("\n"+"Highest Score: "+high);
	}

}
