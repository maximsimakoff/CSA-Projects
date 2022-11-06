import java.util.Scanner;
public class metric_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int n=1;
		int i;
		
		while (n!=0) {
			
System.out.println("Kilos	Pounds");
			for(i=1;i<=200;i++) {
				System.out.print(i);
				System.out.println("	"+i*2.2);
			}
				System.out.println();
				
System.out.println("Miles	Kilometers");
				for(i=1;i<=10;i++) {
					System.out.print(i);
					System.out.println("	"+i*1.609);
				}
					System.out.println();
					
System.out.println("Pounds	Kilos");
					for(i=1;i<=200;i++) {
						System.out.print(i);
						System.out.println("	"+i*.45);
					}
						System.out.println();
				
System.out.println("Kilometers	Miles");
						for(i=20;i<=515;i+=5) {
							System.out.print(i);
							System.out.println("	"+i*.62);
						}
							System.out.println();
				n=0;
				
		}
		
		
	}

}
