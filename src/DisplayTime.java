import java.util.Scanner;
public class DisplayTime {
	/**
	 * Matthew G. Mershon     Date: 2/19/14
	 * Class: CSIS_293
	 * Section: 9240
	 */
	public static void main(String[] args){
		Scanner scanner = new Scanner( System.in );
		System.out.print("Please enter a quantity of seconds.");
		int totalSeconds = scanner.nextInt();
		int days, hours, minutes, remainderSeconds;
		days = totalSeconds / 86400;
		hours = (totalSeconds % 86400) / 3600;
		minutes = (totalSeconds % 3600) / 60;
		remainderSeconds = totalSeconds % 60;
			if( totalSeconds >= 86400){
				System.out.println("You entered " + totalSeconds + " seconds, which is "   
									+ days + " days, " + hours + " hours, " 
									+ minutes + " minutes and " + remainderSeconds
									+ " seconds.");
									  }
				else if( totalSeconds >= 3600){
					System.out.println("You entered " + totalSeconds + " seconds, which is "   
									 + hours + " hours, " + minutes + " minutes and " + 
									 remainderSeconds + " seconds.");
									          }
				else if( totalSeconds >= 60){
					System.out.println("You entered " + totalSeconds + " seconds, which is "   
									+ minutes + " minutes and " + remainderSeconds
									+ " seconds.");
											}
					else{ 
						System.out.println("You entered " + totalSeconds + " seconds, which is "   
									+ remainderSeconds + " seconds.");
						}
					
			}							
	}

